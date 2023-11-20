
/* 
-> Enum: (Enumeration)  (Type safe & readable)

-> Enum                                                          Class
* It is not a class

* It creates instances statically within enum itself       * Instance is created using object.
* Creates predefined constants                             * Creates objects
* Cannot be extended                                       * Can be extended
* It has fixed type so it can be used to error handling.

Note: The predefined constants are Static and Final
*/

enum Status{
    // predefined constants
    Running("100"),Failed("404"),Success("200"),Loading("300");
    

    private String value;

    // private default constructor
    private Status(){
        this.value = "000";
    }
   
    // private parameterised constructor 
    private Status(String value){  // to avoid the instatiation of the enum instance outside enum , the public modifier is not allowed.
        this.value = value;
    }

    // Getters and Setters can be used
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}


public class Enum{
    public static void main(String[] args) {
        
        Status s = Status.Running;
        System.out.println(s.getClass().getSuperclass()); // Super class of enum is "Enum Class"

        //Enhanced for loop
        for (Status types: Status.values()){
            System.out.println("Status : " + types.name() +" " + types.ordinal());
        }


        switch(s){
            case Running:
            System.out.println("in Running state");
            break;

            case Loading:
            System.out.println("in Loading state");
            break;

            case Failed:
            System.out.println("in Failed state");
            break;

            case Success:
            System.out.println("in Success state");
            break;

            default:
            System.out.println("done");
        }

      //  Status.Success = Status.Loading;  // The predefined constants are final so (No change can be made.)
        
    }
}
