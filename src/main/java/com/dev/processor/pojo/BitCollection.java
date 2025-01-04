package com.dev.processor.pojo;

import com.dev.processor.core.bit.Bit;

import java.util.ArrayList;
import java.util.List;

public class BitCollection {

    protected final List<Bit> bitList;


    public BitCollection(){
        this(new ArrayList<>());
    }

    public BitCollection(List<Bit> bitList){
        this.bitList = bitList;
    }

    public void add(Bit bit){
        bitList.add(bit);
    }

    public int size(){
        return bitList.size();
    }

    public Bit at(int index){
        return bitList.get(index);
    }
}
