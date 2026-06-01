import java.util.*;

public class MinimumCost2144 {

    public static int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int total = 0;
        int count = 0;

        for (int i = cost.length - 1; i >= 0; i--) {

            count++;

            if (count % 3 == 0) {
                continue; // free candy
            }

            total += cost[i];
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candies: ");
        int n = sc.nextInt();

        int[] cost = new int[n];

        System.out.println("Enter candy costs:");

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        int result = minimumCost(cost);

        System.out.println("Minimum Cost: " + result);

        sc.close();
    }
}