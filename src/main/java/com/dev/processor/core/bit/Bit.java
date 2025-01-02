package com.dev.processor.core.bit;

public enum Bit {

    BIT_0(false),
    BIT_1(true);

    private final boolean value;

    Bit(boolean value){
        this.value = value;
    }

    public boolean value(){
        return value;
    }

    public int intValue(){
        return (value ? 1 : 0);
    }

    public static Bit get(boolean value){
        return (value ? BIT_1 : BIT_0);
    }

    public static Bit get(int value){
        return (value >= 1 ? BIT_1 : BIT_0);
    }

    public static Bit get(Bit bit){
        return get(bit.value());
    }

    @Override
    public String toString(){
        return String.valueOf(intValue());
    }
}
