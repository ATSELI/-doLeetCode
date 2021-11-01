package 剑指offer.offer04;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/18 18:10
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // 大佬解法,标志数
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length){
            if (matrix[i][j] < target){
                j++;
            }else if (matrix[i][j] > target){
                i--;
            }else {
                return true;
            }
        }
        return false;


        // 行
        // int row = matrix.length;
        // 列
        // int column = matrix[0].length - 1;
        // int min = Math.min(row, column);
        // int record;
        // if (matrix[0][0] > target || matrix[row - 1][column - 1] < target){
        //     return false;
        // }
        // if (matrix[0][0] == target){
        //     return true;
        // }
        // for (int i = 1; i < min; i++){
        //     if (matrix[i][i] == target){
        //         return true;
        //     }
        //     if (matrix[i][i] > target && matrix[i - 1][i -1] < target){
        //         record = i - 1;
        //         for (int j = record; j < row; j ++){
        //             if (matrix[j][record] == target){
        //                 return true;
        //             }
        //         }
        //         for (int j = 0; j < record; j++){
        //             if (matrix[j][record +1] == target){
        //                 return true;
        //             }
        //         }
        //         for (int j = 0; j < record; j ++){
        //             if (matrix[record + 1][j] == target){
        //                 return true;
        //             }
        //         }
        //         for (int j = record; j < column; j++){
        //             if (matrix[record][j] == target){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
        // }



    }
}
