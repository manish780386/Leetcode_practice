
import java.util.Scanner;
import java.util.Arrays;

public class Main806 {

    public static int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int currentWidth = 0;

        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];

            if (currentWidth + width > 100) {
                lines++;
                currentWidth = width;
            } else {
                currentWidth += width;
            }
        }

        return new int[]{lines, currentWidth};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] widths = new int[26];

        for (int i = 0; i < 26; i++) {
            widths[i] = sc.nextInt();
        }

        String s = sc.next();

        int[] result = numberOfLines(widths, s);

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}

