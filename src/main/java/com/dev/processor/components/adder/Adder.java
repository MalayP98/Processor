package com.dev.processor.components.adder;

import com.dev.processor.components.gates.Gate;
import com.dev.processor.core.bit.Bit;
import com.dev.processor.util.Pair;

public final class Adder {

    public static Pair<Bit, Bit> add(Bit b1, Bit b2, Bit carry){
        Bit bitSum = Gate.XOR.calc(b1, b2);
        return Pair.of(
                Gate.XOR.calc(bitSum, carry),
                Gate.OR.calc(Gate.AND.calc(b1, b2), Gate.AND.calc(bitSum, carry))
        );
    }
}
