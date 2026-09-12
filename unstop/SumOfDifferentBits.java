// Problem: Sum of Different Bits
import java.util.*;

public class SumOfDifferentBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int m = a.length();
        int n = b.length();

        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (b.charAt(i) == '1' ? 1 : 0);
        }

        int windows = n - m + 1;
        long matches = 0;

        for (int i = 0; i < m; i++) {
            int left = i;
            int right = i + windows - 1;

            int ones = prefix[right + 1] - prefix[left];
            int zeros = windows - ones;

            matches += (a.charAt(i) == '1') ? ones : zeros;
        }

        long totalComparisons = (long) m * windows;
        System.out.println(totalComparisons - matches);
    }
}
