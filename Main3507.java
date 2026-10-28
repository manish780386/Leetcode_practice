import java.util.*;

public class Main3507 {

public static int minimumPairRemoval(int[] nums) {
    List<Long> arr = new ArrayList<>();

    for (int num : nums) {
        arr.add((long) num);
    }

    int operations = 0;

    while (!isSorted(arr)) {
        int minIndex = 0;
        long minSum = arr.get(0) + arr.get(1);

        for (int i = 1; i < arr.size() - 1; i++) {
            long sum = arr.get(i) + arr.get(i + 1);

            if (sum < minSum) {
                minSum = sum;
                minIndex = i;
            }
        }

        arr.set(minIndex, minSum);
        arr.remove(minIndex + 1);
        operations++;
    }

    return operations;
}

private static boolean isSorted(List<Long> arr) {
    for (int i = 1; i < arr.size(); i++) {
        if (arr.get(i) < arr.get(i - 1)) {
            return false;
        }
    }

    return true;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    System.out.println(minimumPairRemoval(nums));

    sc.close();
}


}
