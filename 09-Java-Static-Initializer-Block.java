import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        try {
            if (a <= 0 || b <= 0) {
                throw new Exception("Break the development process");
            }
            System.out.println(a + b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
