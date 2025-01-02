package com.dev.processor.components.latch;

import com.dev.processor.core.bit.Bit;
import com.dev.processor.components.gates.Gate;

public final class SRLatch {

    private Bit Q = Bit.BIT_1;

    private Bit QBar = Bit.BIT_0;

    public SRLatch reset() throws InterruptedException {
        Q = Gate.NOR.calc(Bit.BIT_1, QBar);
        Thread.sleep(10);
        QBar = Gate.NOR.calc(Q, Bit.BIT_0);
        return this;
    }

    public SRLatch set() throws InterruptedException {
        QBar = Gate.NOR.calc(Q, Bit.BIT_1);
        Thread.sleep(10);
        Q = Gate.NOR.calc(Bit.BIT_0, QBar);
        return this;
    }

    public Bit getQ() {
        return Q;
    }

    public Bit getQBar() {
        return QBar;
    }

    @Override
    public String toString(){
        return "[Q=" + Q.intValue() + ", QBar=" + QBar.intValue() + "]";
    }
}
