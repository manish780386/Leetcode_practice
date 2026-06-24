import java.util.*;

public class ToLowerCase0709 {

    public static String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Lowercase String: " + toLowerCase(s));

        sc.close();
    }
}