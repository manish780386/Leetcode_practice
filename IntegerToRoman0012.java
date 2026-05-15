import java.util.*;

public class IntegerToRoman0012 {

    public static String intToRoman(int num) {

        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] romans = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {
                result.append(romans[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int num = sc.nextInt();

        String roman = intToRoman(num);

        System.out.println("Roman Number: " + roman);

        sc.close();
    }
}