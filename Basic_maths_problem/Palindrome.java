

public class Palindrome {
    public static void main(String[] args) {
        int n = Math.abs(-1221);
        int orginal = n;
        int rev = 0;
        while (n > 0) {
            int last_digit = n % 10;
            rev = rev * 10 + last_digit;
            n = n / 10;
        }
        
        if (rev == orginal) {
            System.out.println("it is palindrome");
            return;
        } else {
            System.out.println("not a palindrome");
        }
    }
}
