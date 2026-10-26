import java.util.*;

public class Main1002 {

public static List<String> commonChars(String[] words) {
    int[] common = new int[26];
    Arrays.fill(common, Integer.MAX_VALUE);

    for (String word : words) {
        int[] freq = new int[26];

        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            common[i] = Math.min(common[i], freq[i]);
        }
    }

    List<String> result = new ArrayList<>();

    for (int i = 0; i < 26; i++) {
        for (int j = 0; j < common[i]; j++) {
            result.add(String.valueOf((char) ('a' + i)));
        }
    }

    return result;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] words = new String[n];

    for (int i = 0; i < n; i++) {
        words[i] = sc.next();
    }

    List<String> result = commonChars(words);
    System.out.println(result);

    sc.close();
}


}
