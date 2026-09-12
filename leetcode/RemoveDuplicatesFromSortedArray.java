import java.util.Arrays;

/**
 * LeetCode 26. Remove Duplicates from Sorted Array
 * Remove duplicates in-place such that each unique element appears only
 * once. Return the number of unique elements k; the first k elements of
 * nums should hold the final result.
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // position to place next unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray sol = new RemoveDuplicatesFromSortedArray();

        int[] nums1 = {1, 1, 2};
        int k1 = sol.removeDuplicates(nums1);
        System.out.println(k1 + " " + Arrays.toString(Arrays.copyOfRange(nums1, 0, k1))); // 2 [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = sol.removeDuplicates(nums2);
        System.out.println(k2 + " " + Arrays.toString(Arrays.copyOfRange(nums2, 0, k2))); // 5 [0, 1, 2, 3, 4]
    }
}
