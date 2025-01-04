package com.dev.processor.components.adder;

import com.dev.processor.core.bit.Bit;
import com.dev.processor.pojo.BinaryDigit;
import com.dev.processor.pojo.BitCollection;
import com.dev.processor.util.Pair;

public class FourBitAdder {

    public static BinaryDigit add(BitCollection bitCollectionA, BitCollection bitCollectionB) throws Exception {
        if(bitCollectionA.size() > 4 || bitCollectionB.size() > 4){
            throw new Exception("4 bit adder cannot add bit collection of size 4+");
        }
        BinaryDigit output = new BinaryDigit();
        Bit carry = Bit.BIT_0;
        for(int i=0; i<4; i++){
            Pair<Bit, Bit> suboutput = Adder.add(bitCollectionA.at(i), bitCollectionB.at(i), carry);
            output.add(suboutput.getFirst());
            carry = suboutput.getSecond();
        }
        return output;
    }
}
