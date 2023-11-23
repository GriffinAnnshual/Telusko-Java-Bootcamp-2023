import java.util.*;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class StreamAPI {
public static void main(String[] args) {
    /*
     The Stream object has only one outflow it can be used only once like , the stream of the river can be touch only once before it pases.
     */

    


    List<Integer> new_list = Arrays.asList(1,2,3,4);
    System.out.println(new_list);

    Stream<Integer> s1 = new_list.stream(); // stream() function returns a Object of type Stream. 
   
    // The internal functioning of filer method( similarly each stream function accepts an object o class implementing the method of the interface[Predicate] that it extends.)
    Predicate<Integer> pred = new Predicate<Integer>(){
        public boolean test(Integer n){
            return n%2!=0;
        }
    };
   
    Stream<Integer> s2 = s1.filter(pred);
    Stream<Integer> s3 = s2.map(n -> n*n);
    int res = s3.reduce(1, (a,b) -> a*b); // Here 1 is the initial value.
    System.out.println(res);

    // Shortcut for implementing the methods of Stream.
    int new_res = new_list.stream()
                        .filter(n -> n %2 == 0)
                        .map(n -> n+2)
                        .reduce(0, (a,c) -> a+c);
    System.out.println(new_res);

}    
}
