// Problem: Find a way
import java.util.*;

public class FindAWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        int[] height = new int[n + 1];
        int[] stack = new int[n];
        int[] order = new int[n];

        int top = 0;
        int count = 0;
        stack[top++] = 1;

        while (top > 0) {
            int node = stack[--top];
            order[count++] = node;

            if (left[node] != -1) {
                stack[top++] = left[node];
            }
            if (right[node] != -1) {
                stack[top++] = right[node];
            }
        }

        int diameter = 0;

        for (int i = count - 1; i >= 0; i--) {
            int node = order[i];

            int leftHeight = left[node] == -1 ? 0 : height[left[node]] + 1;
            int rightHeight = right[node] == -1 ? 0 : height[right[node]] + 1;

            height[node] = Math.max(leftHeight, rightHeight);
            diameter = Math.max(diameter, leftHeight + rightHeight);
        }

        System.out.println(diameter);
    }
}
