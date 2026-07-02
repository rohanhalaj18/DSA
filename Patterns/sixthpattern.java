import java.util.*;
public class sixthpattern {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(5-j+1);
            }
            System.out.println();
        }
    }
}
