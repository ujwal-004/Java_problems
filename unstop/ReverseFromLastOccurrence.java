// Problem: Reverse from Last Occurrence
import java.util.*;

public class ReverseFromLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char ch = sc.next().charAt(0);

        int last = s.lastIndexOf(ch);

        if (last == -1) {
            System.out.println(s);
            return;
        }

        char[] arr = s.toCharArray();
        int left = last;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(new String(arr));
    }
}
