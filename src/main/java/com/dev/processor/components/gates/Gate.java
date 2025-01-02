package com.dev.processor.components.gates;

import com.dev.processor.core.bit.Bit;

import java.util.Objects;

public enum Gate {

    AND("AND") {
        @Override
        public Bit calc(Bit bit0, Bit bit1) {
            if(Objects.isNull(bit0) || Objects.isNull(bit1)){
                throw new IllegalArgumentException("Bit cannot be null.");
            }
            return Bit.get((bit0.value() & bit1.value()));
        }
    },
    OR("OR") {
        @Override
        public Bit calc(Bit bit0, Bit bit1) {
            if(Objects.isNull(bit0) || Objects.isNull(bit1)){
                throw new IllegalArgumentException("Bit cannot be null.");
            }
            return Bit.get((bit0.value() | bit1.value()));
        }
    },
    NOT("NOT") {
        @Override
        public Bit calc(Bit bit0, Bit bit1) {
            if(Objects.isNull(bit0)){
                throw new IllegalArgumentException("Bit cannot be null.");
            }
            return Bit.get(!bit0.value());
        }
    },

    NOR("NOR") {
        @Override
        public Bit calc(Bit bit0, Bit bit1) {
            if(Objects.isNull(bit0) || Objects.isNull(bit1)){
                throw new IllegalArgumentException("Bit cannot be null.");
            }
            return Bit.get(!bit0.value() & !bit1.value());
        }
    },

    XOR("XOR") {
        @Override
        public Bit calc(Bit bit0, Bit bit1) {
            if(Objects.isNull(bit0) || Objects.isNull(bit1)){
                throw new IllegalArgumentException("Bit cannot be null.");
            }
            return Bit.get(bit0.value() ^ bit1.value());
        }
    },

    NAND("NAND") {
        @Override
        public Bit calc(Bit bit0, Bit bit1) {
            return Bit.get(!AND.calc(bit0, bit1).value());
        }
    };

    private final String name;

    Gate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Bit calc(Bit bit0, Bit bit1);
}
