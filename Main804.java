import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main804 {

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.."
        };

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder code = new StringBuilder();

            for (char ch : word.toCharArray()) {
                code.append(morse[ch - 'a']);
            }

            set.add(code.toString());
        }

        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        int result = uniqueMorseRepresentations(words);

        System.out.println("Unique Morse Representations: " + result);

        sc.close();
    }
} 
    

