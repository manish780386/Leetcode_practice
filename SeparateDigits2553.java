import java.util.*;

public class SeparateDigits2553 {

    public static int[] separateDigits(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {

            String str = String.valueOf(num);

            for (char ch : str.toCharArray()) {
                list.add(ch - '0');
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
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

        int[] ans = separateDigits(nums);

        System.out.println("Separated Digits:");

        for (int x : ans) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}