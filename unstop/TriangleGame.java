// Problem: Triangle Game
import java.util.*;

public class TriangleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long value = 1;

        for (int i = 0; i <= n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(value);

            if (i < n) {
                value = value * (n - i) / (i + 1);
            }
        }

        System.out.println();
    }
}
