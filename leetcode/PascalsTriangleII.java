import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 119. Pascal's Triangle II
 * Given an integer rowIndex, return the rowIndex-th row (0-indexed) of
 * Pascal's triangle.
 *
 * Uses the binomial coefficient relation: row[k] = row[k-1] * (n-k+1) / k
 *
 * Time:  O(rowIndex)
 * Space: O(rowIndex) for the output only
 */
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            long next = (long) row.get(i - 1) * (rowIndex - i + 1) / i;
            row.add((int) next);
        }
        return row;
    }

    public static void main(String[] args) {
        PascalsTriangleII sol = new PascalsTriangleII();
        System.out.println(sol.getRow(3)); // [1, 3, 3, 1]
        System.out.println(sol.getRow(0)); // [1]
        System.out.println(sol.getRow(1)); // [1, 1]
    }
}
