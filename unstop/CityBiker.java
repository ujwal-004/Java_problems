// Problem: City Biker
import java.util.*;

public class CityBiker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int altitude = 0;
        int highest = 0;

        for (int i = 0; i < n; i++) {
            altitude += sc.nextInt();
            highest = Math.max(highest, altitude);
        }

        System.out.println(highest);
    }
}
