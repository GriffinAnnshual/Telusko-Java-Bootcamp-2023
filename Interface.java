/* 
abstract class Dress{
    public abstract void stitch();
    public abstract void wear();
}

Interface is not a class. [ it does not have memory]
Every method in interface is public abstract by default.
Every variable in interface is static final by default. (method area)
Cannot instantiate a interface

-> Interface can extend more than one interface

Interface -Interface -> extends
Class -Class -> extends
Class - Interface -> implements


*/

interface Dress {

    int age = 19;
    String name = "Griffin";

    void stitch();

    void wear();

    default void Complay() { // default method is a normal method ( if not present in the implementation used
                             // as default or else overwritten)
        System.out.println("Balmain");
    }
}

interface X {
    void tear();
}

interface Y extends X, Dress {

}

class Pants implements Y { // Class pants implements Y , X AND DRESS (Y extends X and Dress)
    public void stitch() {
        System.out.println("stitching pants...");
    }

    public void wear() {
        System.out.println("wearing pants...");
    }

    public void tear() {
        System.out.println("tearing pants...");
    }
}

class Shirts implements Y {
    public void stitch() {
        System.out.println("stitching shirts...");
    }

    public void wear() {
        System.out.println("wearing shirts...");
    }

    public void tear() {
        System.out.println("tearing stirts...");
    }

}

public class Interface {

    public static void main(String[] args) {
        Dress pant = new Pants();
        pant.stitch();
        Dress shirt = new Shirts();
        shirt.wear();
        // child Y
        Y pant2 = (Y) new Pants();
        pant2.tear();

        System.out.println(Dress.age + " " + Dress.name);
    }

}
