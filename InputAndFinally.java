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
// Another usecase of try block is that [THE OBJECT CREATED IN SIDE THE PRAMETER BRACKET OF THE TRY BLOCK IS AUTO CLOSED]
        try(BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))){  // <----
           System.out.println("Enter the name of the user:");
           String new_name = buf.readLine();
           System.out.println(new_name);
        }
        
        //or 

        try{

        }
        catch(Exception e){

        }
        finally{
            // executes every time , when an error occurs or not.
            //  Unsually utilised as a closing resource block.
            bf.close(); // [eg: to close the bufferreader this is a good practice.]
        }

    } 
}