package com.dev.processor.tests;

import com.dev.processor.components.adder.Adder;
import com.dev.processor.core.bit.Bit;
import com.dev.processor.util.Pair;

public class AdderTest {

    public static void main(String[] args) throws Exception {
        Pair<Bit, Bit> op = null;

        op = Adder.add(Bit.BIT_0, Bit.BIT_0, Bit.BIT_0);
        if(op.getFirst().intValue() != 0 || op.getSecond().intValue() != 0){
            throw new Exception("Test failed.");
        }

        op = Adder.add(Bit.BIT_1, Bit.BIT_1, Bit.BIT_1);
        if(op.getFirst().intValue() != 1 || op.getSecond().intValue() != 1){
            throw new Exception("Test failed.");
        }

        op = Adder.add(Bit.BIT_1, Bit.BIT_1, Bit.BIT_0);
        if(op.getFirst().intValue() != 0 || op.getSecond().intValue() != 1){
            throw new Exception("Test failed.");
        }

        System.out.println("All test passed!");
    }
}
