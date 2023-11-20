
public class FinalKeyword {
    // final -  variable (constant), method(cannot override it) , class(cannot extend class)
    public static void main(String[] args) {
        final float PIE = 3.14f; // make variable constant

    }
}

/* 
final class A{
    public final void show(){
        System.out.println("in New");
    }
} 
class B extends A{  // The type B cannot subclass the final class A [STOPS INHERITANCE]

    public void show(){  // Cannot override the final method from A [STOPS POLYMORPHISM]
        System.out.println("in John");
    }
}

*/