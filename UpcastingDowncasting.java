class A{
public void show2(){
    System.out.println("in A show");
}
}
class B extends A{
public void show1(){
    System.out.println("in B show1");
}
}
class C extends B{
    public void show2(){
        System.out.println("in C show2");
    }
}

public class UpcastingDowncasting{
/*
 A simple trick to understand this concept:  
 -> The type of the object decides it's scope. The object of type of its parent can't have access to unique the method in its child.
 -> Simply " The parents dont know about the child, But the child knows about the parents. "
 */
    public static void main(String[] args) {

        A obj = new B(); // Upcasting assigning child object to parent reference 
    //  obj.show1(); ERROR
        obj.show2();

        B obj2 = (B) obj; // Downcasting converting parent reference to child reference
        obj2.show1();

 // Note : This is a common problem to avoid this: we use the Upcasting and Downcasting

        A obj3 = new C(); // The superclass have no idea of what is in its subclass
     //   obj3.show1(); // superclass dont know child method show1.
        
        // B obj5 = (B) obj3;  // SOLUTION
        // obj5.show();

        obj3.show2();



    }
}