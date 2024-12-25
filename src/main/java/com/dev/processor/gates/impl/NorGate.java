package com.dev.processor.gates.impl;

import com.dev.processor.bits.Bit;
import com.dev.processor.gates.Gate;

import java.util.Objects;

public class NorGate implements Gate {
    @Override
    public String getName() {
        return "Nor";
    }

    @Override
    public Bit calc(Bit bit0, Bit bit1) {
        if(Objects.isNull(bit0) || Objects.isNull(bit1)){
            throw new IllegalArgumentException("Bit cannot be null.");
        }
        return Bit.get(!bit0.value() & !bit1.value());
    }
}
