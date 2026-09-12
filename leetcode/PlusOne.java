import java.util.Arrays;

/**
 * LeetCode 66. Plus One
 * Given a large integer represented as an array of digits, increment the
 * integer by one and return the resulting array of digits.
 *
 * Time:  O(n)
 * Space: O(1) extra (ignoring output)
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne sol = new PlusOne();
        System.out.println(Arrays.toString(sol.plusOne(new int[] {1, 2, 3})));    // [1, 2, 4]
        System.out.println(Arrays.toString(sol.plusOne(new int[] {4, 3, 2, 1}))); // [4, 3, 2, 2]
        System.out.println(Arrays.toString(sol.plusOne(new int[] {9, 9})));       // [1, 0, 0]
    }
}
