class Mobile{
        String brand;  // instance variables (of the object)
        int price;  //               "
        static String name;  // static variable (of the class)

        
        static //  static block is used to initialize the static variables.
        {
            name = "SmartPhone";
            System.out.println("in static block");
        }

        // Constructor initialized the instance variables.
        public Mobile()
        {
            System.out.println("in constructor");
            String brand = "";
            int price = 200;
        }

        public void show() // non static method or instance method
        {
            System.out.println("brand :"+ brand + " price :" + price + " name :" + name); // static variables no problem
        } 

        public static void show1(Mobile obj) //static method of the class. (not dependent on the object)
        {
             System.out.println("brand :"+ obj.brand + " price :" + obj.price + " name :" + name); // non static variable is problem , to avoid it we pass the object to the method.
        }
   }


public class StaticNonStatic
{

    public static void main(String[] args) throws ClassNotFoundException 
    {

        Class.forName("Mobile"); // Java has a Class "Class" it can load the class , without object creation.
        // it invokes the ---> static block.
  
        Mobile obj1 = new Mobile(); // invokes the constructor and intantiates the object
        obj1.brand = "Samsung";
        obj1.price = 1500;
        Mobile.show1(obj1); // calls the static method of the class by passsing the object | to asscess the non static variables inside the static method.


        Mobile obj2 = new Mobile();
        // obj2.show1(); throw an error as show1 belongs to the class Mobile, not the object.
        //static method,variable belongs to the class only.



        obj2.brand  = "Apple";
        obj2.price = 1700;

        System.out.println(Mobile.name);

        obj1.show();
        obj2.show();
        
    }
}


/*
Note:

Why we make the main method static?

if it is not staic: for the main method to be executed, we need to intantiate the Class "Static"
which is not possible as the main method is the starting point of the program. (Dead lock)
So, we make it static.




 */