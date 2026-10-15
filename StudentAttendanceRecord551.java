import java.util.Scanner;

public class StudentAttendanceRecord551 {

    public static boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absent++;
            }
            
            if (c == 'L') {
                late++;
                if (late >= 3) {
                    return false;
                }
            } else {
                late = 0;
            }
        }
        
        return absent <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println(checkRecord(s));
        
        sc.close();
    }
}