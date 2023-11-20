package polymorphism;

public class Main {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();

        obj = new B();
    //  parent variable can contain child object.
        obj.show();

        obj = new C();
        obj.show();
    }
}
/*
 * Explanation:
 *  B and C are subclasses of A (super class).
 * Here the same object "obj.show()" of type A is behaving differently with different objects at runtime(runtime polymorphism)
 * Different objects have different behaviour.
 * 
 *  DYNAMIC METHOD DISPATCHING:
 *  Here the overriden method "show" is resolved at the runtime , this is called as dynamic method dispatching.
 * 
 */