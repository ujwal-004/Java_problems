// Problem: Push the Zeroes
import java.util.*;

public class PushTheZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
