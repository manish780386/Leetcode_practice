import java.util.Scanner;

public class CellswithOddValuesMatrix1252 {
    public static int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rows[i] + cols[j]) % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[][] indices = new int[k][2];
        for (int i = 0; i < k; i++) {
            indices[i][0] = sc.nextInt();
            indices[i][1] = sc.nextInt();
        }
        
        System.out.println(oddCells(m, n, indices));
        sc.close();
    }
}