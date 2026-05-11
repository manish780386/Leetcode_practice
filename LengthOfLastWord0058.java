import java.util.*;

public class LengthOfLastWord0058 {

    public static int lengthOfLastWord(String s) {

        s = s.trim();

        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String s = sc.nextLine();

        int result = lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);

        sc.close();
    }
}