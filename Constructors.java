/*
 * Constructor in java is used to initialize an object -> it has two methods
 * super and this . 
 * The constructor is called when the object is created.
 * evey constructor calls the super method.
 * Object class is the super class of every class in java.
 * 
 * 
 * Try to find the output?  [Excercise on this and super methods]
 */


class A extends Object{  // Every class in java extends a Object class (Super class of every class in a java program.)

    public A()  // constructor
    {
        this(5);
        System.out.println("in A");
    }
    public A(int a) // parameterized constructor
    {
        System.out.println("in A int");
    }
    @Override
    public String toString() {
        return "A []";
    }
    
}


class B extends A{
    
    public B()
    {
       //  super();  (default)  every constructor in java calls a "Super method" --> which calls its super class.
        System.out.println("in B");
    }
    public B(int a) // parameterized constructor
    {
        this();  // this methods class itself
        System.out.println("in B int");
    }

}

public class Constructors extends B{
public static void main(String[] args) {
    B obj = new B(5);
    obj.hashCode(); 

}

}