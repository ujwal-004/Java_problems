// Problem: Consistent Car Models
import java.util.*;

public class ConsistentCarModels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String components = sc.next();
        int n = sc.nextInt();

        boolean[] allowed = new boolean[26];

        for (int i = 0; i < components.length(); i++) {
            allowed[components.charAt(i) - 'a'] = true;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            String model = sc.next();
            boolean consistent = true;

            for (int j = 0; j < model.length(); j++) {
                if (!allowed[model.charAt(j) - 'a']) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }

        System.out.println(count);
    }
}
