import java.util.*;

public class Odd_even{
    public static void main(String[] args) {
        int a = 5;
        if ((a & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        //    o/p 5->  0101
        //             0001
        //         ------------
        //             0001 ->1 (odd)
    }
}