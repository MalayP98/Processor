package com.dev.processor.tests;

import com.dev.processor.core.bit.Bit;
import com.dev.processor.pojo.BitCollection;

public class BitCollectionTest {

    public static void main(String[] args) throws Exception {
        BitCollection bitCollection = new BitCollection();
        bitCollection.add(Bit.BIT_1);
        bitCollection.add(Bit.BIT_1);
        bitCollection.add(Bit.BIT_1);
        bitCollection.add(Bit.BIT_1);
        if(bitCollection.decimalValue() != 15){
            throw new Exception("Test failed.");
        }
        System.out.println("Test passed!");
    }
}
