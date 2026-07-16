import java.util.*;
public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();

        //insertion
        m.put(1, "rohan");
        m.put(2, "aditya");

        //get method
        System.out.println(m.get(2)); //aditya

        Map<Integer, String> table = new HashMap<>();
        table.put(3, "ash");
        table.putAll(m);
        System.out.println(table); //{1=rohan, 2=aditya, 3=ash}

        //deletion
        table.remove(3);
        System.out.println(table);

        //size
        System.out.println(table.size()); //2

        //put if absent
        table.putIfAbsent(4, "roy");
        System.out.println(table); //{1=rohan, 2=aditya, 4=roy}

        //getOrDefault
        System.out.println(table.getOrDefault(5, "none")); //none
        
        System.out.println(table.getOrDefault(4, "none")); //roy
        
        //containsValue()
        System.out.println(table.containsValue("roy")); //true
   

        System.out.println(table.entrySet()); //[1=rohan, 2=aditya, 4=roy]

        
        

    }
}