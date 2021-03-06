package medium;

/**
 * @author takaibun
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        for (char[] nums:matrix){
            for (char num:nums){
                System.out.print(num);
            }
            System.out.println();
        }
        System.out.println();
        int[][] opt = new int[matrix.length][matrix[0].length];
        int maximal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '0') {
                    opt[i][j] = 0;
                }else
                if (i - 1 < 0 || j - 1 < 0) {
                    opt[i][j] = 1;
                }else
                if (opt[i - 1][j - 1] >0&& opt[i - 1][j]>0 && opt[i][j - 1]>0) {
                    opt[i][j] = Math.min(opt[i-1][j],Math.min(opt[i][j - 1],opt[i-1][j - 1])) + 1;
                    if (maximal < opt[i][j]) {
                        maximal = opt[i][j];
                    }
                }else {
                    opt[i][j] =  1;
                }
                for (int[] nums:opt){
                    for (int num:nums){
                        System.out.print(num);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            for (int[] nums:opt){
                for (int num:nums){
                    System.out.print(num);
                }
                System.out.println();
            }
            System.out.println();
        }
        return maximal * maximal;
    }
}
