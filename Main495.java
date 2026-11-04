import java.util.Scanner;
public class Main495 {
public static int findPoisonedDuration(int[] timeSeries, int duration) {
    int total = 0;

    for (int i = 0; i < timeSeries.length; i++) {
        if (i == timeSeries.length - 1) {
            total += duration;
        } else {
            total += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
    }

    return total;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] timeSeries = new int[n];

    for (int i = 0; i < n; i++) {
        timeSeries[i] = sc.nextInt();
    }

    int duration = sc.nextInt();

    System.out.println(findPoisonedDuration(timeSeries, duration));

    sc.close();
}


}

    

