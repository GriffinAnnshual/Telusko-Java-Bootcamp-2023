import java.io.*;
import java.util.*;
class User extends HashSet<Integer> implements Comparable<User>{
    // Objects of the Collections should implement the comparable interface to be able to use its methods (sort , binary search etc..) 
    // So it is important for the User object to implement the Comparable interface. to get that power.
    
    private String username;
    private int rollno;
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public User(String username, int rollno) {
    this.username = username;
    this.rollno = rollno;
    }
    public int compareTo(User other){
        return this.rollno>other.rollno? 1:-1; // -> 1 means swap -1 means not swap (this is used to sort.)
    }
}

public class CollectionLesson {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        Set<Integer> new_set = new HashSet<Integer>();
        List<User> user_set = new ArrayList<User>();
        
        // System.out.println("Enter the input:");
        // for (int i=0;i<3;i++)
        // {
        //     int num =  Integer.parseInt(bf.readLine());
        //     new_set.add(num);
        // }
        // System.out.println("printing:");
        // for(Integer i: new_set){
        //     System.out.println(i);
        // }
        
        // new_set.forEach((x)->{
        //     System.out.println(x);
        // });

        // Iterator<Integer> it = new_set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(int i=0;i<2;i++)
        {   System.out.println("Enter the username: ");
            String name = bf.readLine();
            System.out.println("Enter the rollno:");
            int rollno = Integer.parseInt(bf.readLine());
            user_set.add(new User(name,rollno));
        }

        // Comparator is used for defining a comparison logic for sorting elements
        // sort in descending order
        Comparator<User> com = (User i,User j) -> {
            return i.getRollno()<j.getRollno()?1:-1;
        };


        // The collections.sort() method accepts a custom logic comparator [compare method] to sort the array userset as it is of the type User. This by default follows comparable logic for integers. which is extended by the integer class.
        Collections.sort(user_set,com); // The comparator of the collection intefface overrides the compareTo method of comparable interface.

        for(User user : user_set){
            System.out.println("Name: " +user.getUsername() + " Rollno: " + user.getRollno());
        }

        // Implementation of List: add,remove
        List<Integer> new_list =  new ArrayList<>();
        new_list.add(10);
        new_list.add(11);
        new_list.add(60);
        new_list.remove(0);
        System.out.println(new_list);

        //Implementation of the Map: get,put,keySet
        Map<String,Integer> new_map = new HashMap<>();
        new_map.put("Griffin",19);
        new_map.put("Griffin",20);
        new_map.put("Virat kholi",36);
        System.out.println(new_map);
    
        for(String key: new_map.keySet()){
            System.out.println(key + " : "+ new_map.get(key));
        }

        //Implementation of TreeSet (this is sorted)
        Set<Integer> new_tree_set = new TreeSet<>();
        new_tree_set.add(21);
        new_tree_set.add(11);
        new_tree_set.add(210);
        System.out.println(new_tree_set);
    }
}
