import java.util.Scanner;
public class Main485 {
   
public static int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int maxCount = 0;

    for (int num : nums) {
        if (num == 1) {
            count++;
            maxCount = Math.max(maxCount, count);
        } else {
            count = 0;
        }
    }

    return maxCount;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    System.out.println(findMaxConsecutiveOnes(nums));

    sc.close();
}


}

    

