// Problem: Pair of Subarrays
import java.util.*;

public class PairOfSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n + 1];
        long[] prefix = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
            prefix[i] = prefix[i - 1] + a[i];
        }

        long answer = 0;
        HashMap<Long, Long> map = new HashMap<>();

        for (int l = 1; l <= n; l++) {
            int end = l - 1;

            if (end >= 1) {
                for (int start = 1; start <= end; start++) {
                    long sum = prefix[end] - prefix[start - 1];
                    map.put(sum, map.getOrDefault(sum, 0L) + 1);
                }
            }

            for (int r = l; r <= n; r++) {
                long sum = prefix[r] - prefix[l - 1];
                answer += map.getOrDefault(sum, 0L);
            }
        }

        System.out.println(answer);
    }
}
