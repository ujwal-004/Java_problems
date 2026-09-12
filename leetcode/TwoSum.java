import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * LeetCode 1. Two Sum
 * Given an array of integers nums and an integer target, return indices of
 * the two numbers such that they add up to target.
 *
 * Time:  O(n)
 * Space: O(n)
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        System.out.println(Arrays.toString(sol.twoSum(new int[] {2, 7, 11, 15}, 9))); // [0, 1]
        System.out.println(Arrays.toString(sol.twoSum(new int[] {3, 2, 4}, 6)));      // [1, 2]
        System.out.println(Arrays.toString(sol.twoSum(new int[] {3, 3}, 6)));         // [0, 1]
    }
}
