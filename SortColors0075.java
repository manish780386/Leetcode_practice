import java.util.*;

public class SortColors0075 {

    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements (0, 1, 2):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sortColors(nums);

        System.out.println("Sorted Array:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}