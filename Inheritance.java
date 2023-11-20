import tools.*;
import tools.VeryAdvCalculator;

public class Inheritance {
    public static void main(String[] args) {

        VeryAdvCalculator cal = new VeryAdvCalculator();
        int r1 = cal.add(1,3); // if i call cal.add then object of veryadvcal says that my parent has this method.
        int r2 = cal.mul(1, 1);
        int r3 = cal.div(10,5);
        int r4 = cal.power(2,4);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}


/*
 * Types of inheritence in Java:
 *  
 * -> Single inheritance -> Multilevel -> Heirarchical
 * 
 * -> Multiple inheritance (Not supported)
 * 
 * -> Hybrid inheritance (Not supported)
 * 
 * 
 *  A class cannot extend more than one class in java, as it can lead to ambiguity
 * (allowed in other programming languages).
 * 
 */

/* 
Single 
class B{

}
 class A extends B{

 }


 Multilevel

 class A{

 }
 class B extends A{

 }
 class C extends B{

 }

 Heirarchical

 class A{

 }
 class B extends A{

 }
 class C extends A{

 }
``````````````````````````````````````````````````````````````````````````````

 class D extends A,B{ // XXX this is not possible in java (Multiple inheritence)

 }



  */