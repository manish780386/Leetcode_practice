import java.util.Scanner;

public class SumOfSquares2778 {
public static int sumOfSquares(int[] nums) {
int n = nums.length;
int sum = 0;

    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            sum += nums[i - 1] * nums[i - 1];
        }
    }

    return sum;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    System.out.println(sumOfSquares(nums));

    sc.close();
}


}
