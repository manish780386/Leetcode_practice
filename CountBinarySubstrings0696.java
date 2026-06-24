import java.util.*;

public class CountBinarySubstrings0696 {

    public static int countBinarySubstrings(String s) {

        int prevGroup = 0;
        int currGroup = 1;
        int result = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                currGroup++;
            } else {

                result += Math.min(prevGroup, currGroup);

                prevGroup = currGroup;
                currGroup = 1;
            }
        }

        result += Math.min(prevGroup, currGroup);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String s = sc.nextLine();

        int answer = countBinarySubstrings(s);

        System.out.println("Count = " + answer);

        sc.close();
    }
}