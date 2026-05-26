import java.util.*;

public class LetterCombinations0017 {

    static String[] keypad = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void backtrack(String digits,
                                 int index,
                                 String current,
                                 List<String> result) {

        if (index == digits.length()) {

            if (!current.isEmpty()) {
                result.add(current);
            }

            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {

            backtrack(digits,
                      index + 1,
                      current + ch,
                      result);
        }
    }

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        backtrack(digits, 0, "", result);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");

        String digits = sc.nextLine();

        List<String> ans = letterCombinations(digits);

        System.out.println("Letter Combinations:");

        for (String s : ans) {
            System.out.println(s);
        }

        sc.close();
    }
}