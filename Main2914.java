import java.util.Scanner;

public class Main2914 {

    public static int minChanges(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String s = sc.nextLine();

        int result = minChanges(s);

        System.out.println("Minimum changes: " + result);

        sc.close();
    }
}