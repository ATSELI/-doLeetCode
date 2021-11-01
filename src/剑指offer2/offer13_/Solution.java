package 剑指offer2.offer13_;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/9 15:17
 *给定一个二维矩阵 matrix，以下类型的多个请求：
 *
 * 计算其子矩形范围内元素的总和，该子矩阵的左上角为 (row1,col1) ，右下角为 (row2,col2) 。
 * 实现 NumMatrix 类：
 *
 * NumMatrix(int[][] matrix)给定整数矩阵 matrix 进行初始化
 * int sumRegion(int row1, int col1, int row2, int col2)返回左上角 (row1,col1)、右下角(row2,col2)的子矩阵的元素总和。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/O4NDxx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 辅助矩阵，坐标sums[row + 1][col + 1]存入的是matrix[0][0]到matrix[row][col]矩阵的和
    private  int[][] sums;
    // 初始化辅助矩阵，为方便计算，sums行列数各+1
    public void NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        // 遍历计算辅助矩阵，每行的值为上一个单元格的值加当前行的和
        sums = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum += matrix[i][j];
                sums[i+1][j+1] = sums[i][j + 1] + rowSum;
            }
        }
    }
    //使用辅助矩阵计算指定矩阵区域的和
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sums[row2 + 1][col2 + 1] - sums[row1][col2 + 1] - sums[row2 + 1][col1] + sums[row1][col1];
    }

    // 作者：ling-han-i
    // 链接：https://leetcode-cn.com/problems/O4NDxx/solution/jian-zhi-offer-zhuan-xiang-tu-po-ban-gua-wsj5/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
