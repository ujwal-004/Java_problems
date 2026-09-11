import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();

        String reversed = new StringBuilder(A).reverse().toString();

        if (A.equals(reversed)) {
            System.out.println("The word, " + A + ", is a palindrome.");
        } else {
            System.out.println(A + " is not a palindrome.");
        }
    }
}
