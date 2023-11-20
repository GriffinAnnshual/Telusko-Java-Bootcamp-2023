class Griffin{
    public void show(){
        System.out.println("in A");
    }

    public void config(){
        System.out.println("in config");
    }
    public int add(int a,int b)
    {
        return a + b;
    }
}

class Golphin extends Griffin{
    public void show(){
        System.out.println("in B");
    }

    public int add(int a,int b)
    {
        return a + b + 1;
    }
}

/* METHOD OVERRIDING (Runtime polymorphism)
 * 
 * 
 */

public class MethodOverriding {
    public static void main(String[] args) {
        Golphin obj = new Golphin();
        obj.show();
        System.out.println(obj.add(1,1));
         // add of Class Golphin is found first.
    }
}
