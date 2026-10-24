import java.util.Scanner;

public class Main463 {


public static int islandPerimeter(int[][] grid) {
    int perimeter = 0;
    int rows = grid.length;
    int cols = grid[0].length;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (grid[i][j] == 1) {
                perimeter += 4;

                if (i > 0 && grid[i - 1][j] == 1) {
                    perimeter -= 2;
                }

                if (j > 0 && grid[i][j - 1] == 1) {
                    perimeter -= 2;
                }
            }
        }
    }

    return perimeter;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] grid = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            grid[i][j] = sc.nextInt();
        }
    }

    System.out.println(islandPerimeter(grid));

    sc.close();
}


}
