package java_concur_practice.c3;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class MutableInteger {
    private int value;

    public int getValue(){
        return value;
    }

    public void setValue(int i){
        this.value = i;
    }
}
