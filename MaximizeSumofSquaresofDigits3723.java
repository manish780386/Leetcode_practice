import java.util.Scanner;

public class MaximizeSumofSquaresofDigits3723 {

    public static String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        int remaining = sum;
        
        while (num > 0) {
            int digit = Math.min(9, remaining);
            result.append(digit);
            remaining -= digit;
            num--;
        }
        
        if (remaining > 0) {
            return "";
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = sc.nextInt();
        
        System.out.println(maxSumOfSquares(num, sum));
        sc.close();
    }
}