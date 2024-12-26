package com.dev.processor.clock;

import com.dev.processor.bits.Bit;
import com.dev.processor.gates.impl.NotGate;

import java.util.Queue;

public class Clock {

    private final Queue<Bit> bitQueue;

    public Clock(Queue<Bit> bitQueue) {
        this.bitQueue = bitQueue;
    }

    public void start() throws InterruptedException {
        NotGate notGate = new NotGate();
        Bit bit = Bit.BIT_0;
        while(true){
            Thread.sleep(100);
            bitQueue.add(bit);
            bit = notGate.calc(bit, null);
        }
    }
}
