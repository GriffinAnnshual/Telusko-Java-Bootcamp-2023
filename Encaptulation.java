class Human
{  // Encaptulation means not giving the direct access to the instance variables of the class to other classes. instead tells it to access the variable using a method.
    // This methods are called getters and setters

    public Human() // default constructor
    {
        age = 12;
        name = "Griffin";
    }
    public Human(int a ,String n) // parameterized constructor
    {
        this.age = a;
        this.name = n;
    }

    private String name;
    private int age;

    public int getName()
    {
        return age;
    }
    public String getAge()
    {
        return name;
    }
    public void setName(String new_name)
    {
        this.name =  new_name;
    }
    // public void setAge(int age)
    // {
    //     age = age; // here the local variable is age and the instance variable is also age.
    //                 //  so the compiler gives the preferece to local variable ( always local variable > preferece that instance variable)
    // }               // so the instance variable reamains 0 itself
    public void setAge(int age,Human obj) // solve this problem by passing the object to the instance method
    {
        obj.age = age;
    }
    // or (use "this" keyword in java.)
    public void setAge(int age) // solve this problem by passing the object to the instance method
    {
        this.age = age;
    }
    // this -- > represents the currect object
}


public class Encaptulation {

    public static void main(String[] args)
    {

    Human obj = new Human();
    
    obj.setName("Griffin");
    obj.setAge(100,obj);
    Human obj2 = new Human();
    Human obj3 = new Human(10,"Golphin");
    System.out.println(obj2.getName() + " : " + obj2.getAge());
    System.out.println(obj3.getName() + " : " + obj3.getAge());
    System.out.println(obj.getAge());
    System.out.println(obj.getName());
  
    }

    
}
