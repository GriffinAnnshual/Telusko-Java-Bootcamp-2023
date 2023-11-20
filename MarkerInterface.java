
/*
 Examples of markerinterface:
 1. Clonable (makes a class clonable)
 2. Serializable (makes a class serializable)
    ABLE TO STORE ITS STATE IN A FILE.
 */



// By implementing Cloneable interface 
// we make sure that instances of class A 
// can be cloned. 
import java.io.*;
class A implements Cloneable 
{ 
    int i; 
    String s; 
  
    // A class constructor 
    public A(int i,String s) 
    { 
        this.i = i; 
        this.s = s; 
    } 
  
    // Overriding clone() method 
    // by simply calling Object class 
    // clone() method. 
    @Override
    protected Object clone() 
    throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
} 


class B implements Serializable 
{ 
    int i; 
    String s; 
  
    // A class constructor 
    public void A(int i,String s) 
    { 
        this.i = i; 
        this.s = s; 
    } 
} 






public class MarkerInterface {
    public static void main(String[] args) throws IOException, ClassNotFoundException,CloneNotSupportedException{
        A a = new A(20, "GeeksForGeeks");

        // cloning 'a' and holding
        // new cloned object reference in b

        // down-casting as clone() return type is Object
        A b = (A) a.clone();

        System.out.println(b.i);
        System.out.println(b.s);

        A c = new A(20, "GeeksForGeeks");

        // Serializing 'a'
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);

        // De-serializing 'a'
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        A d = (A) ois.readObject();// down-casting object

        System.out.println(d.i + " " + d.s);

        // closing streams
        oos.close();
        ois.close();
    }
}
