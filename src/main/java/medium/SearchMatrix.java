package medium;

/**
 * @author takaibun
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }
        int row = 0;
        while (row < matrix.length) {
            if (target > matrix[row][matrix[row].length - 1]) {
                row++;
                continue;
            }
            return binarySearch(matrix[row], target);
        }
        return false;
    }

    private boolean binarySearch(int[] matrix, int target) {
        int star = 0, end = matrix.length - 1;
        while (star <= end) {
            int mid = (star + end) / 2;
            if (matrix[mid] == target) {
                return true;
            }
            if (matrix[mid] < target) {
                star = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
