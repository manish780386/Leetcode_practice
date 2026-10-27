import java.util.Scanner;
import java.util.Arrays;

public class Main3963 {


public static String[] createGrid(int m, int n) {
    char[][] grid = new char[m][n];

    for (int i = 0; i < m; i++) {
        Arrays.fill(grid[i], '#');
    }

    Arrays.fill(grid[0], '.');

    for (int i = 0; i < m; i++) {
        grid[i][n - 1] = '.';
    }

    String[] result = new String[m];

    for (int i = 0; i < m; i++) {
        result[i] = new String(grid[i]);
    }

    return result;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();

    String[] result = createGrid(m, n);

    System.out.println(Arrays.toString(result));

    sc.close();
}


}
