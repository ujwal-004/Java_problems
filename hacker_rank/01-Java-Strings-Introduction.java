import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();

        int lengthOfA = A.length();
        int lengthOfB = B.length();
        System.out.println(lengthOfA + " " + lengthOfB);

        String result = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(result);

        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
