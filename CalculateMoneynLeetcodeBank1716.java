import java.util.Scanner;
public class CalculateMoneynLeetcodeBank1716{
    public static int totalMoney(int n) {
        int totalWeeks = n / 7;
        int remainingDays = n % 7;
        
        // Complete weeks ka sum (Arithmetic progression formula se)
        int completeWeeksSum = totalWeeks * 28 + 7 * (totalWeeks * (totalWeeks - 1) / 2);
        
        // Bache hue days ka sum jo incomplete week mein aate hain
        int remainingDaysSum = remainingDays * totalWeeks + (remainingDays * (remainingDays + 1) / 2);
        
        return completeWeeksSum + remainingDaysSum;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(totalMoney(n));
        scanner.close();
    }
}