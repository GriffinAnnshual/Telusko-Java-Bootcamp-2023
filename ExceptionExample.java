class GriffinException extends Exception { // This is a Custom exception
    public GriffinException(String message){
        // To access the constructor of the super class (exception)
        super(message);
    }
}


public class ExceptionExample {

    static public void test() throws GriffinException{ // Passed the exception to the parent
        throw new GriffinException("This is not a valid name.");
    }

    public static void main(String[] args) {
        
    int i = 2;
    int j = 0;
    int arr[] = new int[5];
    String name ="Griffin";
        
    try{
        j = 10/i;
        System.out.println(arr[4]);
        System.out.println(name.length());
/*  
        Generate a exception using throw:                                                  */
        // if (j == 0) throw new ArithmeticException("This is not a valid!");

        test(); // The error thown by test method is handled by the main method. 
    }
    catch(ArithmeticException e){
        System.out.println("Cannot divide by zero."+ e.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The limit of the array is exceeded."+ e.getMessage());
    }
    catch(GriffinException e){
        System.out.println("Griffin Exception: " + e.getMessage());
        e.printStackTrace(); // [Easier way to debug exception]
    }
    catch(Exception e){
        System.out.println("Something went wrong."+ e.getMessage());
        
    }

    }
}


// Note:
/*
 Refer this image: ~./images/ExceptionFamilyTree.PNG

 To create my own custom exception: (extend the exception class.)

 There are two types of exception: 1. UNChecked exception - the exception that need not to be handled compulsory. eg: Runtime exceptions, Nullpointer exceptions
 2. Checked exception - the exceptions that need to be handled mandatory. eg; Ioexception , SQLException.
 */

 