package com.dev.processor.gates;

import com.dev.processor.bits.Bit;

public interface Gate {

    String getName();

    Bit calc(Bit bit0, Bit bit1);
}
