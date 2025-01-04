package com.dev.processor.tests;

import com.dev.processor.components.gates.Gate;
import com.dev.processor.util.Utilities;

import java.util.Arrays;

public class GateTester {

    public static void test(){
        Arrays.asList(Gate.values()).forEach(gate -> {
            try {
                System.out.println(Utilities.getTruthTable(gate));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
