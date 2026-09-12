// Problem: Basketball Game
import java.util.*;

public class BasketballGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String op = sc.next();

            if (op.equals("+")) {
                int last = stack.get(stack.size() - 1);
                int secondLast = stack.get(stack.size() - 2);
                stack.push(last + secondLast);
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        System.out.println(sum);
    }
}
