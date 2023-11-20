
public class StringLesson{
    public static void main(String[] args) {
        
        // String is not a primitive datatype it is a 
        // class
        /* 
         There are two methods to create a string :
         1. Literal
         2. Object
        */
        // String name1 = new String("Griffin"); // actual way. 

        String name2 =  "Griffin Annshual";  //frequently used.

        // char ch[] = {'G','r','i','f','f','i','n'};

        // String name3 = new String(ch);
        // System.out.println(name1+  " : "+ name2 + " : "+ name3);
        System.out.println(name2.concat(" Annshual"));
        System.out.println(name2.indexOf("G"));
        System.out.println(name2.hashCode());
        System.out.println(name2.substring(0,3));


    // StringBuffer (Thread is a syncronous process , String buffer is thread safe.)
    
    StringBuffer sb = new StringBuffer("Griffin Annshual");
    // Always it has an extra capacity to make sure that the concecuent memory space is free. if not it relocates.
    // its capacity =  length(sb) + 16 (default)
    System.out.println(sb.capacity());
    
    // Mutable appBend insert is possible.
    sb.append(" Java");
    sb.insert(17,"Loves "); 
    sb.setLength(40);
    System.out.println(sb.capacity());
    System.out.println(sb);


    //String Builder is a asycnconous process (It is not thread safe.)

    StringBuilder str = new StringBuilder("Griffin Annshual");
    str.append(" is my name.");
    str = str.reverse();
    str.equals(str);
    str.compareTo(str);
    System.out.println(str);



}
}