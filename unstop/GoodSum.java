// Problem: Good Sum
import java.util.*;

public class GoodSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] stack = new long[n + 1];
        long[] prefix = new long[n + 1];
        int size = 0;

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();

            if (x >= 0) {
                stack[size] = x;
                size++;
                prefix[size] = prefix[size - 1] + x;
            } else {
                long need = -x;
                long total = prefix[size];
                long target = total - need;

                int left = 0;
                int right = size;
                int k = 0;

                while (left <= right) {
                    int mid = left + (right - left) / 2;

                    if (prefix[mid] <= target) {
                        k = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

                size = k;
                stack[size] = need;
                size++;
                prefix[size] = prefix[size - 1] + need;
            }
        }

        System.out.println(prefix[size]);
    }
}
