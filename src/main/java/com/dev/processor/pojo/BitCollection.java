package com.dev.processor.pojo;

import com.dev.processor.core.bit.Bit;

import java.util.ArrayList;
import java.util.List;

public class BitCollection {

    private final List<Bit> bitList;

    private final List<Integer> powerMap = new ArrayList<>();

    public BitCollection(){
        this(new ArrayList<>());
    }

    public BitCollection(List<Bit> bitList){
        this.bitList = bitList;
        for(int i=0; i<32; i++){
            powerMap.add((int) Math.pow(2, i));
        }
    }

    public void add(Bit bit){
        bitList.add(bit);
    }

    public int decimalValue(){
        int decimalValue = 0;
        for(int i=0; i<bitList.size(); i++){
            decimalValue += bitList.get(i).intValue() * powerMap.get(i);
        }
        return decimalValue;
    }

    public int size(){
        return bitList.size();
    }

    public Bit at(int index){
        return bitList.get(index);
    }
}
