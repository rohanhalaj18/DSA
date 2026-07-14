import java.util.*;
public class SetInterface {
  public static void main(String[] args) {
      //set using HashSet
      
    //    2. Key Features
    //        Unordered → does not maintain insertion order.

    //        Allows one null element.

    //         No duplicate values.

    //          Fast operations (add, remove, search) → average O(1).

    Set<Integer> setA = new HashSet<>();
    Set<Integer> setB = new HashSet<>();
    setA.add(5);
    setA.add(5);
    System.out.println(setA); // prints a single 5; sets store unique elements and HashSet order is not guaranteed
    setA.add(6);
    setB.add(6);
    setB.add(7);
    setA.retainAll(setB);
    System.out.println(setA);
    System.out.println(setA.containsAll(setB)); // false
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
