import java.util.Scanner;

public class Main3736 {


public static long minMoves(int[] nums) {
    int max = 0;
    long sum = 0;

    for (int num : nums) {
        max = Math.max(max, num);
        sum += num;
    }

    return (long) max * nums.length - sum;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    System.out.println(minMoves(nums));

    sc.close();
}


}
