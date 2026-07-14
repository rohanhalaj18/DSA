import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        //arraylist
//         📘 ArrayList – Short Notes
// 1. Definition
// Part of java.util package.

// Implements List interface.

// Dynamic array → grows/shrinks automatically.

// 2. Key Features
// Ordered collection → maintains insertion order.

// Allows duplicates.

// Index-based access (like arrays).

// Resizable → unlike fixed-size arrays.

// 3. Performance
// Access (get/set) → O(1) (fast).

// Insert/Delete at end → O(1) amortized.

// Insert/Delete in middle → O(n) (shifting required).

// 4. Constructors
// ArrayList() → default capacity (10).

// ArrayList(int capacity) → custom initial capacity.

// ArrayList(Collection c) → copies another collection.

// 5. Common Methods
// add(E e) → add element.

// get(int index) → retrieve element.

// set(int index, E e) → replace element.

// remove(int index) / remove(Object o) → delete.

// size() → number of elements.

// clear() → remove all elements.

// contains(Object o) → check existence.

// isEmpty() → check if empty.
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(2);

        list.add(3);
        list.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(2));
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.get(2));
        Object[] obj = list.toArray();
        for (Object arr : obj) {
            System.out.println(arr);
        }
        list.sort(null );
        System.out.println(list);
        
        //linked list
        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.addFirst(5);
        linkList.addFirst(6);
        linkList.addLast(10);
        System.out.println(linkList);


    }
}
