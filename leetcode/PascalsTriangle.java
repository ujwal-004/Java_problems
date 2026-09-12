import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 118. Pascal's Triangle
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * Time:  O(numRows^2)
 * Space: O(numRows^2) for the output
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        PascalsTriangle sol = new PascalsTriangle();
        System.out.println(sol.generate(5));
        // [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
        System.out.println(sol.generate(1));
        // [[1]]
    }
}
