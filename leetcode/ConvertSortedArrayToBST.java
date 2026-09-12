import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 108. Convert Sorted Array to Binary Search Tree
 * Given an integer array sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 *
 * Time:  O(n)
 * Space: O(log n) recursion stack (excluding output tree)
 */
public class ConvertSortedArrayToBST {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, lo, mid - 1);
        root.right = build(nums, mid + 1, hi);
        return root;
    }

    private void inorder(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        inorder(root.left, out);
        out.add(root.val);
        inorder(root.right, out);
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBST sol = new ConvertSortedArrayToBST();
        TreeNode tree = sol.sortedArrayToBST(new int[] {-10, -3, 0, 5, 9});
        List<Integer> result = new ArrayList<>();
        sol.inorder(tree, result);
        System.out.println(Arrays.toString(result.toArray())); // [-10, -3, 0, 5, 9]
    }
}
