import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NumberofDaysBetweenTwoDates1360 {


public static int daysBetweenDates(String date1, String date2) {
    LocalDate d1 = LocalDate.parse(date1);
    LocalDate d2 = LocalDate.parse(date2);

    return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String date1 = sc.nextLine();
    String date2 = sc.nextLine();

    System.out.println(daysBetweenDates(date1, date2));

    sc.close();
}
}


