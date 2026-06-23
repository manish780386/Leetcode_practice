import java.util.*;

public class SumOfTwoIntegers0371 {

    public static int getSum(int a, int b) {

        while (b != 0) {

            int carry = (a & b) << 1;

            a = a ^ b;

            b = carry;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = getSum(a, b);

        System.out.println("Sum = " + result);

        sc.close();
    }
}