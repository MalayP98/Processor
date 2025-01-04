package com.dev.processor.tests;

import com.dev.processor.core.bit.Bit;
import com.dev.processor.pojo.BinaryDigit;
import com.dev.processor.pojo.BitCollection;

public class BitCollectionTest {

    public static void test() throws Exception {
        BinaryDigit binaryDigit = new BinaryDigit();
        binaryDigit.add(Bit.BIT_1);
        binaryDigit.add(Bit.BIT_1);
        binaryDigit.add(Bit.BIT_1);
        binaryDigit.add(Bit.BIT_1);
        if(binaryDigit.decimalValue() != 15){
            throw new Exception("Test failed.");
        }
        System.out.println("All test passed!");
    }
}
