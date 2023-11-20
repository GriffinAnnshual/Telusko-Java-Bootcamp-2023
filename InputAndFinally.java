import java.io.*;
import java.util.Scanner;

public class InputAndFinally{
    public static void main(String[] args)throws IOException {
        
        System.out.println("Enter the name:");
        System.in.read(); // returns the ascii value of the input byte, takes 1 byte as input.
        

        // type 2: (BufferReader class)

        System.out.println("Enter the name:");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();

        System.out.println("Enter the value:");
        System.out.println(Integer.parseInt(bf.readLine()));


        //type 3: Scanner Class:

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

// Now come to the finally keyword:

        try{

        }
        finally{
            
        }

        //or 

        try{

        }
        catch(Exception e){

        }
        finally{
            // executes every time , when an error occurs or not.
            //  Unsually utilised as a closing block.
            bf.close(); // [eg: to close the bufferreader this is a good practice.]
        }

    } 
}