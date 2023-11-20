/* Functional interface is an interface with only one method. */

@FunctionalInterface
interface Calci{
    int add(int a, int b);
}

@FunctionalInterface  
interface Alien{
    void show();
}

/* This say's that this class is no longer supported. */

@Deprecated 
class B implements Alien{
/*
    This annotation create the intution that The following method overwrites a method 
    If it doesn't , it will show an error. ( So that we can debug easily)
 */
    @Override  
    public void show(){
        System.out.println("in show B");
    }
}


public class AnnotationsAndLambdaExpression {
    public static void main(String[] args) {
        // Deprecated class usage
        B obj1 = new B();
        obj1.show();

        // Before using lambda expression (Anonymous class):
        Alien obj = new Alien() {
            public void show() {
                System.out.println("in show A");
            }
        };
        obj.show();

        // After using lambda expression: (1 LINE)
        Alien obj2 = () -> System.out.println("in show A using lambda expression");
        obj2.show();

        // Simplified Calculator lambda expression
        Calci obj3 = (a, b) -> a + b;
        System.out.println(obj3.add(0, 0));

    }
}
