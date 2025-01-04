package com.dev.processor.tests;

import com.dev.processor.components.latch.SRLatch;

public class TestRunner {

    public static void main(String[] args) throws Exception {
        AdderTest.test();
        BitCollectionTest.test();
        FourBitAdderTest.test();
        SRLatchTest.test();
        GateTester.test();
    }
}
