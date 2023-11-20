class A {
    int age;
    String name;

    public void config() {
        System.out.println("in config A");
    }

    class B {

        public void config() {
            System.out.println("in config B");
        }
    }

    static class D {
        public void config() {
            System.out.println("in config D");
        }
    }
}

abstract class C {
    public abstract void config();
}


public class InnerClassAndAnonymousClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.config();

        // Way to refer to the inner class
        // <Outer reference>.<Inner> = <OuterObj>. new <inner obj>
        A.B obj1 = obj.new B();
        obj1.config();

        // Way to refer the inner static class
        // Class D doesn't depend on object of A.

        A.D obj2 = new A.D();
        obj2.config();

        /*
         * Anonymous class:
         * Abstract method of C can be implemented by anonymous class also for single time use.
         * -> Used to provide the implementation of the abstract method , this inner anonymous class is used.
         */
 
         C obj3 = new C(){   // this is a inner anonymous class of C
            public void config(){  
                System.out.println("in config abstract C");
            }
         };
         obj3.config();

    }
}
