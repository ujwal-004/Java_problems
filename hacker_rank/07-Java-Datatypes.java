import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            String x = scan.next();

            try {
                byte b = Byte.parseByte(x);
                System.out.println(b + " can be fitted in:\n* byte\n* short\n* int\n* long");
                continue;
            } catch (Exception e) {}

            try {
                short s = Short.parseShort(x);
                System.out.println(s + " can be fitted in:\n* short\n* int\n* long");
                continue;
            } catch (Exception e) {}

            try {
                int i = Integer.parseInt(x);
                System.out.println(i + " can be fitted in:\n* int\n* long");
                continue;
            } catch (Exception e) {}

            try {
                long l = Long.parseLong(x);
                System.out.println(l + " can be fitted in:\n* long");
                continue;
            } catch (Exception e) {}

            System.out.println(x + " can't be fitted anywhere.");
        }
    }
}
