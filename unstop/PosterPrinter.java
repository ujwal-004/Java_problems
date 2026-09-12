// Problem: Poster Printer
import java.util.*;

public class PosterPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean possible = true;
            int countB = 0;
            int countR = 0;

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                if (ch == 'W') {
                    if ((countB > 0 && countR == 0) ||
                        (countR > 0 && countB == 0)) {
                        possible = false;
                        break;
                    }
                    countB = 0;
                    countR = 0;
                } else if (ch == 'B') {
                    countB++;
                } else {
                    countR++;
                }
            }

            if ((countB > 0 && countR == 0) ||
                (countR > 0 && countB == 0)) {
                possible = false;
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}
