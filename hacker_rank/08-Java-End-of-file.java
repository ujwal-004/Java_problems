import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(i + " " + line);
            i++;
        }
    }
}
