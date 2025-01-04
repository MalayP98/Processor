package com.dev.processor.components.gates;

import com.dev.processor.core.bit.Bit;

import java.util.Objects;

public enum Gate {

    AND("AND") {
        @Override
        protected Bit calc0(Bit bit0, Bit bit1) {
            if(Objects.isNull(bit0) || Objects.isNull(bit1)){
                throw new IllegalArgumentException("Bit cannot be null.");
            }
            return Bit.get((bit0.value() & bit1.value()));
        }
    },
    OR("OR") {
        @Override
        protected Bit calc0(Bit bit0, Bit bit1) {
            if(Objects.isNull(bit0) || Objects.isNull(bit1)){
                throw new IllegalArgumentException("Bit cannot be null.");
            }
            return Bit.get((bit0.value() | bit1.value()));
        }
    },
    NOT("NOT") {
        @Override
        protected Bit calc0(Bit bit0, Bit bit1) {
            if(Objects.isNull(bit0)){
                throw new IllegalArgumentException("Bit cannot be null.");
            }
            return Bit.get(!bit0.value());
        }
    },

    NOR("NOR") {
        @Override
        protected Bit calc0(Bit bit0, Bit bit1) {
            if(Objects.isNull(bit0) || Objects.isNull(bit1)){
                throw new IllegalArgumentException("Bit cannot be null.");
            }
            return Bit.get(!bit0.value() & !bit1.value());
        }
    },

    XOR("XOR") {
        @Override
        protected Bit calc0(Bit bit0, Bit bit1) {
            if(Objects.isNull(bit0) || Objects.isNull(bit1)){
                throw new IllegalArgumentException("Bit cannot be null.");
            }
            return Bit.get(bit0.value() ^ bit1.value());
        }
    },

    NAND("NAND") {
        @Override
        protected Bit calc0(Bit bit0, Bit bit1){
            return Bit.get(!AND.calc0(bit0, bit1).value());
        }
    };

    private final String name;

    Gate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract Bit calc0(Bit bit0, Bit bit1);

    public Bit calc(Bit bit0, Bit bit1) throws InterruptedException {
        // Every gate has some delay while generating output
        Thread.sleep(5);
        return this.calc0(bit0, bit1);
    }
}
