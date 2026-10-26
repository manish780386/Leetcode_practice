import java.util.*;

public class Main1018 {


public static List<Boolean> prefixesDivBy5(int[] nums) {
    List<Boolean> result = new ArrayList<>();
    int remainder = 0;

    for (int num : nums) {
        remainder = (remainder * 2 + num) % 5;
        result.add(remainder == 0);
    }

    return result;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    System.out.println(prefixesDivBy5(nums));

    sc.close();
}


}
