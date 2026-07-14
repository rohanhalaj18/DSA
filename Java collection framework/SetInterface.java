import java.util.*;
public class SetInterface {
  public static void main(String[] args) {
      //set using HashSet
      
    //    2. Key Features
    //        Unordered → does not maintain insertion order.

    //        Allows one null element.

    //         No duplicate values.

    //          Fast operations (add, remove, search) → average O(1).

    Set<Integer> st = new HashSet<>();
    Set<Integer> st2 = new HashSet<>();
      st.add(5);
      st.add(5);
      System.out.println(st); //only one 5 will print set will store unique num and not in order
      st.add(6);
      st2.add(6);
      st2.add(7);
      st.retainAll(st2);
      System.out.println(st);
      System.out.println(st.containsAll(st2)); //false
      HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // duplicate ignored

        System.out.println(set);       // [Java, Python] (order not guaranteed)
        System.out.println(set.contains("Python")); // true
        set.remove("Java");
        System.out.println(set); // [Python]
        
       //TreeSet will store in sorted order 

        Set<Integer> set3 = new TreeSet<>();
        set3.add(55);
        set3.add(65);
        set3.add(2);
        System.out.println(set3 );
  }  
}
