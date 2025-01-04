package com.dev.processor.tests;

import com.dev.processor.components.adder.FourBitAdder;
import com.dev.processor.core.bit.Bit;
import com.dev.processor.pojo.BinaryDigit;

import java.util.Arrays;

public class FourBitAdderTest {

    public static void test() throws Exception {
        BinaryDigit three = new BinaryDigit(Arrays.asList(Bit.BIT_1,Bit.BIT_1,Bit.BIT_0,Bit.BIT_0));
        BinaryDigit ten = new BinaryDigit(Arrays.asList(Bit.BIT_0,Bit.BIT_1,Bit.BIT_0,Bit.BIT_1));
        BinaryDigit thirteen = FourBitAdder.add(three, ten);
        if(thirteen.decimalValue() != 13){
            throw new Exception("Test failed.");
        }
        System.out.println("All test passed!");

    }
}
