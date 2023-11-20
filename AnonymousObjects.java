class B
{
    public B()
    {
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in B show");
    }
}

public class AnonymousObjects {
    public static void main(String[] args) throws Exception {
        B obj = new B(); // obj is the reference variable  | can be used again
        obj.show();

        new B().show(); // no reference variable  | on time use only
        // ----- This is called a AnonymousObject ------
    }
}
