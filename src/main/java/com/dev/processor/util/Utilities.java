package com.dev.processor.util;

import com.dev.processor.core.bit.Bit;
import com.dev.processor.components.gates.Gate;

public class Utilities {

    public static String getTruthTable(Gate gate) throws Exception {
        StringBuilder tableBuilder = new StringBuilder();
        tableBuilder.append(gate.getName()).append("\n");
        for(int i=0; i<=1; i++){
            for(int j=0; j<=1; j++){
                tableBuilder
                        .append("-------------")
                        .append("\n")
                        .append("| ")
                        .append(i)
                        .append(" | ")
                        .append(j)
                        .append(" | ")
                        .append(gate.calc(Bit.get(i), Bit.get(j)).intValue())
                        .append(" |")
                        .append("\n");
            }
        }
        return tableBuilder.append("-------------").toString();
    }
}
