import java.util.Scanner;

public class Main {
    public static String determineColor(String s) {
        // Write your logic here to determine the color based on the string s.
        // Return "Black" or "White" based on the problem statement.
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}
chessboard