import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindPositiveInteger1237 {
    public static int f(int x, int y) {
         return x + y; 
        } 
        public static List<List<Integer>> findSolution(int z) {
             List<List<Integer>> ans = new ArrayList<>();
              int x = 1; int y = 1000; 
              while (x <= 1000 && y >= 1) { 
                int value = f(x, y); 
                if (value == z) { 
                    ans.add(Arrays.asList(x, y)); 
                    x++; y--; 
                } else if (value < z) { 
                    x++; 
                } else {
                     y--;
                     } }
                      return ans; 
                    } 
                    public static void main(String[] args) { 
                        Scanner sc = new Scanner(System.in);
                         int z = sc.nextInt();
                          List<List<Integer>> result = findSolution(z);
                           for (List<Integer> pair : result) {
                             System.out.println(pair.get(0) + " " + pair.get(1)); 
                            }
                              sc.close(); }
    
}
