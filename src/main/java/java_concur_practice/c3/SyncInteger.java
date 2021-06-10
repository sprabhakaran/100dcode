package java_concur_practice.c3;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class SyncInteger {
    @GuardedBy("this") private int i;
    public synchronized int getInt(){
        return i;
    }

    public synchronized void setInt(int i){
        this.i = i;
    }
}
