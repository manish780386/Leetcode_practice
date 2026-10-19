import java.util.*;

public class Main2089 {


public static List<Integer> targetIndices(int[] nums, int target) {
    int smaller = 0;
    int equal = 0;

    for (int num : nums) {
        if (num < target) {
            smaller++;
        } else if (num == target) {
            equal++;
        }
    }

    List<Integer> ans = new ArrayList<>();

    for (int i = smaller; i < smaller + equal; i++) {
        ans.add(i);
    }

    return ans;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    int target = sc.nextInt();

    System.out.println(targetIndices(nums, target));

    sc.close();
}


}

