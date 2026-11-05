import java.util.Scanner;

public class Main1385 {


public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    int count = 0;

    for (int x : arr1) {
        boolean valid = true;

        for (int y : arr2) {
            if (Math.abs(x - y) <= d) {
                valid = false;
                break;
            }
        }

        if (valid) {
            count++;
        }
    }

    return count;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr1 = new int[n];

    for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextInt();
    }

    int m = sc.nextInt();
    int[] arr2 = new int[m];

    for (int i = 0; i < m; i++) {
        arr2[i] = sc.nextInt();
    }

    int d = sc.nextInt();

    System.out.println(findTheDistanceValue(arr1, arr2, d));

    sc.close();
}


}
