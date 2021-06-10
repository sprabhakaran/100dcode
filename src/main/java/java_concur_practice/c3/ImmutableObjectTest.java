package java_concur_practice.c3;

/*
Because program state changes all the time, you might be tempted to think that immutable objects are of limited use,
but this is not the case. There is a difference between an object being immutable and the reference to it being immutable.
Program state stored in immutable objects can still be updated by “replacing” immutable objects with a new instance
 */

public class ImmutableObjectTest {
    public static void main(String[] args) {
        ImmutableObject o = new ImmutableObject()   ;
        o.addEl("aaaa");
        System.out.println(o.getSet());
    }
}
