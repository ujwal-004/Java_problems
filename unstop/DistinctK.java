// Problem: Distinct K
import java.util.*;

public class DistinctK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        HashMap<String, Integer> frequency = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            frequency.put(arr[i], frequency.getOrDefault(arr[i], 0) + 1);
        }

        int k = sc.nextInt();
        int count = 0;

        for (String value : arr) {
            if (frequency.get(value) == 1) {
                count++;
                if (count == k) {
                    System.out.println(value);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
