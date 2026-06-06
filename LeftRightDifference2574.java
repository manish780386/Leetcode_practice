import java.util.*;

public class LeftRightDifference2574 {

    public static int[] leftRightDifference(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            totalSum -= nums[i]; // rightSum

            result[i] = Math.abs(leftSum - totalSum);

            leftSum += nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = leftRightDifference(nums);

        System.out.println("Result Array:");

        for (int x : ans) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}