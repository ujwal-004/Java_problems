/**
 * LeetCode 35. Search Insert Position
 * Given a sorted array of distinct integers and a target, return the index
 * if the target is found, or the index where it would be inserted in order.
 *
 * Time:  O(log n)
 * Space: O(1)
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        SearchInsertPosition sol = new SearchInsertPosition();
        System.out.println(sol.searchInsert(new int[] {1, 3, 5, 6}, 5)); // 2
        System.out.println(sol.searchInsert(new int[] {1, 3, 5, 6}, 2)); // 1
        System.out.println(sol.searchInsert(new int[] {1, 3, 5, 6}, 7)); // 4
    }
}
