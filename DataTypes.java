public class DataTypes{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 11;
        long num5 = num1 + num2; // auto boxing int --> long (implicit)
        System.out.println(num5);

        double num3 = 7.9;
        float num4 = 7.9f;
        double result = num1 + num2 + num3 + num4; // autoboxing (implicit)
        System.out.println(result);

        // primitive datatypes
        //<datatype> <variable> =  <literals>
        boolean q = true;
        byte b = 127;
        char t = 'a';
        short s = 12;
        int i =  12;

        //  long r = 287364923874; //error because the rhs by default is int (out of range)
        long f = 287364923874l;

        //   float k = 7.8; // error because the rhs by default is double
        float j = 7.8f;

        // integer literals :
        int binary = 0b101;
        int hexa =  0x7E;
        int large_num = 1_00_00_000; // (easy to read)

        double numee = 12e10;
        double speed_of_the_light = 3e8;
        System.out.println((int)numee+","+(int)speed_of_the_light);

        // char to no conversion
        char character = 'a';
        character++;
        System.out.println((int)character); // b
        // ( char --> int....)
        

    // int to byte conversion

   /*   Given int = ?
        Step: 1
        Do -  n modulo 256
       
        Step: 2
        if ans > 128:
        -(256-ans)

        if ans < 128:
        (ans)    */

        byte bella = 127;
        int hella = 350;

        // 350%256 == 94 (<128) == 94
        bella = (byte)hella;  
        System.out.println(bella);  
    
    // type promotion
    byte a = 30;
    byte c = 110;
    int res = a*c; // type promotion ( byte to int)
    

    int x = 10;
    double d = 1.0;
    boolean ho = x>d;
    System.out.println(ho);

    // // do-while loop in java:
    // do{
    //     System.out.println("Briyani");
    //     break;
    // }while(true);

    // //while loop
    // while( true || false){
    //     System.out.println("briyani");
    // }
    int k = 0;
    // for (init <optional>;<condition>; incre/decre <optional>)
    for (;k<i;){
        System.out.println("Briyani");
    k++;
    }
}


/* Notes:

    * Java support unary operator like a-- or a++ and
    * post as well as pre increment also.
    * It is not possible to convert bool to int and int to bool.
    *Java Code --> (Javac) Byte Code ---> (JVM) Runs the byte code
    *JVM runs on  --> JRE

    *JDK =  JRE + JDK
    * Types of datatypes in java
    * primitive and derived datatype
    * primitive - Integer, Float , Character, Boolean
    *                |       |
    *              Byte     Double
    *              int      Float
    *             Short  
    *             Long                     

    char --> 2 byte
    boolean --> true or false

    short - 2 bytes  
    int - 4 bytes (default)
    long - 8 bytes

    float - 4 bytes
    double - 6 bytes (default)
    byte - 1 byte

*/ 

}