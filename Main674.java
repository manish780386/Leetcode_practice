import java.util.Scanner;

public class Main674 {

public static int findLengthOfLCIS(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }

    int count = 1;
    int maxLength = 1;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] > nums[i - 1]) {
            count++;
        } else {
            count = 1;
        }

        maxLength = Math.max(maxLength, count);
    }

    return maxLength;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    System.out.println(findLengthOfLCIS(nums));

    sc.close();
}

}
