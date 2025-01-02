package com.dev.processor.tests;

import com.dev.processor.components.adder.FourBitAdder;
import com.dev.processor.core.bit.Bit;
import com.dev.processor.pojo.BitCollection;

import java.util.Arrays;

public class FourBitAdderTest {

    public static void main(String[] args) throws Exception {
        BitCollection three = new BitCollection(Arrays.asList(Bit.BIT_1,Bit.BIT_1,Bit.BIT_0,Bit.BIT_0));
        BitCollection ten = new BitCollection(Arrays.asList(Bit.BIT_0,Bit.BIT_1,Bit.BIT_0,Bit.BIT_1));
        BitCollection thirteen = FourBitAdder.add(three, ten);
        if(thirteen.decimalValue() != 13){
            throw new Exception("Test failed.");
        }
        System.out.println("Test passed!");

    }
}
