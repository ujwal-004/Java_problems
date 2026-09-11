import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int month = scan.nextInt();
            int day = scan.nextInt();
            int year = scan.nextInt();

            LocalDate date = LocalDate.of(year, month, day);
            System.out.println(date.getDayOfWeek());
        }
    }
}
