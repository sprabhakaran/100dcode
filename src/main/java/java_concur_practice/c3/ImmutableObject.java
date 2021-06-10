package java_concur_practice.c3;

import net.jcip.annotations.Immutable;

import java.util.HashSet;
import java.util.Set;

@Immutable
public class ImmutableObject {
    private final Set set = new HashSet();
    public ImmutableObject(){
        set.add("100");
        set.add("200");
        set.add("339");
    }

    public void addEl(String s){
        set.add(s);
    }

    public Set getSet(){
        return set;
    }
}
