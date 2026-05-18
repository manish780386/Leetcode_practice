import java.util.*;

public class GenerateParentheses0022 {

    public static void generate(String current,
                                int open,
                                int close,
                                int n,
                                List<String> result) {

        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        if (open < n) {
            generate(current + "(", open + 1, close, n, result);
        }

        if (close < open) {
            generate(current + ")", open, close + 1, n, result);
        }
    }

    public static List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        generate("", 0, 0, n, result);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = sc.nextInt();

        List<String> ans = generateParenthesis(n);

        System.out.println("Valid Parentheses:");

        for (String s : ans) {
            System.out.println(s);
        }

        sc.close();
    }
}