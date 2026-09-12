// Problem: Exchanging Gifts
import java.util.*;

public class ExchangingGifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int giver = sc.nextInt();
            int receiver = sc.nextInt();
            outDegree[giver]++;
            inDegree[receiver]++;
        }

        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == n - 1 && outDegree[i] == 0) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
