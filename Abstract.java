
/*
 * Abstract class cannot be instantiated, but their subclassed which implements their abstract methods
 * can be instantiated.
 * -> acts as a common Interface for a group of sub classes.
 * -> it is a partial implementation of a class.
 * 
 * "A abstract method should be in a abstract class" but a "abstract class may or may not have a abstract methods".
 */

abstract class Computer // abstract class can contain abstract and concrete methods.
{
    public void code() { // concrete method.
        System.out.println("in code");
    }

    public abstract void run();

    public abstract void config(); // abstract methods do not contain a body.
                                   // they are implemented by their sub classes
}

abstract class Laptop extends Computer { // this class not implements all the abstract methods ( does only one so it should also be a abstract class)

    public void config() {
        System.out.println("in config laptop");
    }
}

class UpdatedLaptop extends Laptop {   // concrete class
    public void config() {
        System.out.println("in config updated laptop");
    }
    public void version(){
        System.out.println("new version...");
    }
    public void run() {
        System.out.println("compile debug run code : slower");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Laptop lap = new UpdatedLaptop();
        UpdatedLaptop newlap = (UpdatedLaptop) lap;
        lap.code();
        lap.config();
        lap.run();
        newlap.version(); // typecasted the lap (laptop to updated laptop)
        // error lap.version(); // version is out of scope of type Laptop
    }
}
