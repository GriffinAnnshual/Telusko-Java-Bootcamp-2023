class A{
public void show(){
    System.out.println("in A show");
}
}
class B extends A{
public void show1(){
    System.out.println("in B show1");
}
}

public class UpcastingDowncasting{
    public static void main(String[] args) {

        A obj = new B(); // Upcasting assigning child object to parent reference 
    //  obj.show1(); ERROR
        obj.show();

        B obj2 = (B) obj; // Downcasting converting parent reference to child reference
        obj2.show1();

 // Note : This is a common problem to avoid this: we use the Upcasting and Downcasting

        A obj3 = new A(); // The superclass have no idea of what is in its subclass
     //   obj3.show1(); // superclass dont know child method show1.
        
        B obj5 = (B) obj3;  // SOLUTION
        obj5.show1();



    }
}