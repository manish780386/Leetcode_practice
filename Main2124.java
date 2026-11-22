import java.util.Scanner;

public class Main2124 {

    public static boolean checkString(String s) {
        boolean foundB = false;

        for (char ch : s.toCharArray()) {
            if (ch == 'b') {
                foundB = true;
            } else if (foundB) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = checkString(s);

        System.out.println("Result: " + result);

        sc.close();
    }
}