import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        int num = Math.abs(-123456);
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
