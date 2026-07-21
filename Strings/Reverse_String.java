
import java.util.*;

public class Reverse_String {
    public static void main(String[] args) {

        //bruteforce
        String name = "Rohann";
        StringBuffer newName = new StringBuffer();
        for (int i = name.length() - 1; i >= 0; i--) {
            newName.append(name.charAt(i));
        }
        
        System.out.println(newName.toString());


        String a = "Hell0";
        StringBuffer b = new StringBuffer(a);
        
        System.out.println(b.reverse());
    }
}
