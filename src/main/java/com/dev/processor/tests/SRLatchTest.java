package com.dev.processor.tests;

import com.dev.processor.components.latch.SRLatch;
import com.dev.processor.core.bit.Bit;

public class SRLatchTest {

    public static void main(String[] args) throws Exception {
        SRLatch srLatch = new SRLatch();
        Bit q = Bit.BIT_1, qbar = Bit.BIT_0;
        for(int i=0; i<10; i++){
            if(i%2 == 0){
                srLatch.set();
                if(!srLatch.getQ().equals(q) || !srLatch.getQBar().equals(qbar)){
                    throw new Exception("Test failed.");
                }
            }
            else {
                srLatch.reset();
                if(!srLatch.getQ().equals(qbar) || !srLatch.getQBar().equals(q)){
                    throw new Exception("Test failed.");
                }
            }
        }
        System.out.println("All test passed!");
    }
}
