// Problem: Sum of Node's value of a given range
import java.util.*;

public class SumOfNodesValueOfAGivenRange {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static long findSum(Node root, int start, int end) {
        if (root == null) {
            return 0;
        }

        if (root.value < start) {
            return findSum(root.right, start, end);
        }

        if (root.value > end) {
            return findSum(root.left, start, end);
        }

        return root.value
                + findSum(root.left, start, end)
                + findSum(root.right, start, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(findSum(root, start, end));
    }
}
