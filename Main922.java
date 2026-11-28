import java.util.Scanner;

public class Main922 {

    public static int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;

        while (even < nums.length && odd < nums.length) {
            if (nums[even] % 2 == 0) {
                even += 2;
            } else if (nums[odd] % 2 != 0) {
                odd += 2;
            } else {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;

                even += 2;
                odd += 2;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sortArrayByParityII(nums);

        System.out.print("Sorted Array: ");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}