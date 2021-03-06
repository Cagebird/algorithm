package medium;

/**
 * @author takaibun
 * <p>
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 */
public class MinPathSum {
    /**
     * 最小公共子问题：min_sum(i,j) = Math.min(min_sum(i+1,j), min_sum(i,j+1)) + grid[i][j]
     * 状态数组：F[i,j]
     * DP方程：F[i,j] = Math.min(F[i+1,j], F[i,j+1] + grid[i,j]
     */
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    continue;
                }
                if (i == m - 1) {
                    grid[i][j] = grid[i][j + 1] + grid[i][j];
                } else if (j == n - 1) {
                    grid[i][j] = grid[i + 1][j] + grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i + 1][j], grid[i][j + 1]) + grid[i][j];
                }
            }
        }
        return grid[0][0];
    }
}
