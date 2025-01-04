package com.dev.processor.pojo;

import com.dev.processor.core.bit.Bit;

import java.util.ArrayList;
import java.util.List;

public class BinaryDigit extends BitCollection{

    private final List<Integer> powerMap = new ArrayList<>();

    public BinaryDigit(){
        this(new ArrayList<>());
    }

    public BinaryDigit(List<Bit> bitList){
        super(bitList);
        for(int i=0; i<32; i++){
            powerMap.add((int) Math.pow(2, i));
        }
    }

    public int decimalValue(){
        int decimalValue = 0;
        for(int i=0; i<bitList.size(); i++){
            decimalValue += bitList.get(i).intValue() * powerMap.get(i);
        }
        return decimalValue;
    }


}
