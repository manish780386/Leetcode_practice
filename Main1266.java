import java.util.Scanner;

public class Main1266 {

    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for (int i = 1; i < points.length; i++) {
            int dx = Math.abs(points[i][0] - points[i - 1][0]);
            int dy = Math.abs(points[i][1] - points[i - 1][1]);

            time += Math.max(dx, dy);
        }

        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of points: ");
        int n = sc.nextInt();

        int[][] points = new int[n][2];

        System.out.println("Enter coordinates:");

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        int result = minTimeToVisitAllPoints(points);

        System.out.println("Minimum time: " + result);

        sc.close();
    }
}