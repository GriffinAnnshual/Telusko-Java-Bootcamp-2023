public class ExceptionExample {
    public static void main(String[] args) {
        
    int i = 2;
    int j = 0;
    int arr[] = new int[5];
    String name =null;
        
    try{
        j = 10/i;
        System.out.println(arr[4]);
        System.out.println(name.length());
    }
    catch(ArithmeticException e){
        System.out.println("Cannot divide by zero.");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The limit of the array is exceeded.");
    }
    catch(Exception e){
        System.out.println("Something went wrong.");
    }

    }
}


// Note:
/*
 Refer this image: 
 */