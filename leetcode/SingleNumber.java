/**
 * LeetCode 136. Single Number
 * Given a non-empty array of integers where every element appears twice
 * except for one, find that single one.
 *
 * Uses XOR: a ^ a = 0 and a ^ 0 = a, so all paired elements cancel out.
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber sol = new SingleNumber();
        System.out.println(sol.singleNumber(new int[] {2, 2, 1}));        // 1
        System.out.println(sol.singleNumber(new int[] {4, 1, 2, 1, 2}));  // 4
        System.out.println(sol.singleNumber(new int[] {1}));              // 1
    }
}
