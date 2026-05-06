import java.util.*;
public class PalindromeNumber0009 {

    public static boolean isPalindrome(int x) {
        
        if (x < 0) return false;

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = sc.nextInt();

        boolean result = isPalindrome(x);

        if (result) {
            System.out.println("Palindrome Number ");
        } else {
            System.out.println("Not a Palindrome ");
        }

        sc.close();
    }
}
