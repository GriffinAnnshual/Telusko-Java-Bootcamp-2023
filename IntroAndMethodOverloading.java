class Calculator{

    /*
     Difference made using parameters --- METHOD OVERLOADING (Compiletime polymorphism)
     Difference in return type does't matter.
     */
    
    int num1=5;
    public int add(int a ,int b){             
        return a+b;
    } 

    public int add(int a,int b,int c){
        return 0;
       } 

    public int add(byte a,byte b){
        return a +b;
    }

    public double add(double a,int b){
        return a + b;
    }

    // diff no of parameters and diff parameter type
}



public class IntroAndMethodOverloading{
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 66;
        Calculator clac = new Calculator();
        Calculator clac1 = new Calculator();
        clac1.num1 = n1;
        System.out.println("Instance variables:");
        System.out.println(clac1.num1);
        System.out.println(clac.num1);
            

        System.out.println(clac);
        int result = clac.add(n1,n2);
        System.out.println(result);     
        
    }


/* Notes:

    Class:
    A Class is a template for the implementation of the object.

    Object:
    Object Oriented Programming:
    Object + Methods --> behavior and properties
      
    What i know -> properties
    What i do --> behavior (action)

    Trick:
    Class  ---> Idea;
    Object ---> Prototype { behavior and properties}



    Polymorphism means different forms:

    Water can be in liquid as well as solid form (ice).
    Similarly the methods in java can have same name but different behaviour(actions).
    Polymorphism can be achieved in java by using Method overloading and method overriding.
    Method overloading in java:

    Same method name - diff no of parameters
    Same method name - diff type of parameters and 

*/
}