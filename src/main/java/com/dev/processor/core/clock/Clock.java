package com.dev.processor.core.clock;

import com.dev.processor.components.gates.Gate;
import com.dev.processor.core.bit.Bit;

import java.util.Queue;

public final class Clock {

    private final Queue<Bit> bitQueue;

    public Clock(Queue<Bit> bitQueue) {
        this.bitQueue = bitQueue;
    }

    public void start() throws InterruptedException {
        Bit bit = Bit.BIT_0;
        while(true){
            Thread.sleep(10);
            bitQueue.add(bit);
            bit = Gate.NOT.calc(bit, null);
        }
    }
}
