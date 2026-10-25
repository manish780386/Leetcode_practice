import java.util.Scanner;

public class Main942 {

public static int[] diStringMatch(String s) {
    int n = s.length();
    int low = 0;
    int high = n;
    int[] ans = new int[n + 1];

    for (int i = 0; i < n; i++) {
        if (s.charAt(i) == 'I') {
            ans[i] = low++;
        } else {
            ans[i] = high--;
        }
    }

    ans[n] = low;
    return ans;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int[] result = diStringMatch(s);

    System.out.print("[");
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]);
        if (i < result.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");

    sc.close();
}


}
