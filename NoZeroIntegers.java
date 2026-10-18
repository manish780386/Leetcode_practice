import java.util.Scanner;

public class NoZeroIntegers {

    public static int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (!containsZero(a) && !containsZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[0];
    }

    private static boolean containsZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                int[] result = getNoZeroIntegers(n);

                if (result.length == 2) {
                    System.out.println(result[0] + " " + result[1]);
                }
            }
        }
    }
}