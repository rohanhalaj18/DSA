import java.util.*;
class Optimal{
    Optimal(int num){
        int ct = (int) (Math.log10(num) + 1);
        System.out.println(ct);
    }
}
public class CountDigits {
    public static void main(String[] args) {
        
        int num = Math.abs(-123456);
        Optimal o1 = new Optimal(num);
        int count = 0;
        if (num == 0) {
            System.out.println("1");
            return;
        }
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
