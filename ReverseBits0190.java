import java.util.*;

public class ReverseBits0190 {

    public static int reverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            result <<= 1;

            result |= (n & 1);

            n >>>= 1;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");

        int n = sc.nextInt();

        int result = reverseBits(n);

        System.out.println("Reversed Bits Value: " + result);

        sc.close();
    }
}