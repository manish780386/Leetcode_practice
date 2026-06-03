import java.util.*;

public class SearchRotatedArray0033 {

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half sorted hai
            if (nums[left] <= nums[mid]) {

                if (target >= nums[left] &&
                    target < nums[mid]) {

                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Right half sorted hai
            else {

                if (target > nums[mid] &&
                    target <= nums[right]) {

                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter rotated sorted array:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = search(nums, target);

        System.out.println("Target Index: " + result);

        sc.close();
    }
}