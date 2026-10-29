import java.util.Scanner;

public class Main643 {


public static double findMaxAverage(int[] nums, int k) {
    int sum = 0;

    for (int i = 0; i < k; i++) {
        sum += nums[i];
    }

    int maxSum = sum;

    for (int i = k; i < nums.length; i++) {
        sum += nums[i] - nums[i - k];
        maxSum = Math.max(maxSum, sum);
    }

    return (double) maxSum / k;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    int k = sc.nextInt();

    System.out.printf("%.5f%n", findMaxAverage(nums, k));

    sc.close();
}


}
