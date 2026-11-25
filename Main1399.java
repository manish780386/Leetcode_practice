import java.util.Scanner;

public class Main1399 {

    public static int countLargestGroup(int n) {
        int[] count = new int[37];

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int num = i;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            count[sum]++;
        }

        int max = 0;
        int result = 0;

        for (int c : count) {
            if (c > max) {
                max = c;
                result = 1;
            } else if (c == max) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = countLargestGroup(n);

        System.out.println("Count of Largest Groups: " + result);

        sc.close();
    }
}