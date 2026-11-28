import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main929 {

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");

            String local = parts[0].replace(".", "");

            int index = local.indexOf('+');

            if (index != -1) {
                local = local.substring(0, index);
            }

            String uniqueEmail = local + "@" + parts[1];

            set.add(uniqueEmail);
        }

        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of emails: ");
        int n = sc.nextInt();

        String[] emails = new String[n];

        System.out.println("Enter email addresses:");

        for (int i = 0; i < n; i++) {
            emails[i] = sc.next();
        }

        int result = numUniqueEmails(emails);

        System.out.println("Unique Email Addresses: " + result);

        sc.close();
    }
}