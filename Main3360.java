import java.util.Scanner;

public class Main3360 {

    public static boolean canAliceWin(int n) {
        int stones = 10;
        int turn = 0;

        while (n >= stones) {
            n -= stones;
            stones--;
            turn++;
        }

        return turn % 2 == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stones: ");
        int n = sc.nextInt();

        boolean result = canAliceWin(n);

        System.out.println("Can Alice Win: " + result);

        sc.close();
    }
}