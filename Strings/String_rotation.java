
import java.util.*;
public class String_rotation {
    public static void main(String[] args) {
        String s = "hello", goal = "lohelx";
        int s_n = s.length();
        int g_n = goal.length();
        
        if (s_n != g_n) {
            System.out.println("false");

        }
        int flag = 0;
        for (int i = 1; i < s_n+1; i++) {

            // if (s.equals(goal)) {
            //     System.out.println("true");
            // }
            String ans = new String(goal);
            
            ans = goal.substring(i) + goal.substring(0, i);
            System.out.println(ans);
            if (ans.equals(s)) {
                System.out.println("true");
                flag = 1;
                break;
            }

        }
        if(flag==0){
            System.out.println("false");
        }
    }
}
