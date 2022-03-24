package oneQuestionPerDay.LeetCode2022.Month1.Day1;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/1/1 15:31
 * 给你一个下标从 0开始的一维整数数组original和两个整数m和n。你需要使用original中所有元素创建一个m行n列的二维数组。
 * original中下标从 0到 n - 1（都 包含 ）的元素构成二维数组的第一行，下标从 n到 2 * n - 1（都 包含）的元素构成二维数组的第二行，依此类推。
 *
 * 请你根据上述过程返回一个m x n的二维数组。如果无法构成这样的二维数组，请你返回一个空的二维数组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-1d-array-into-2d-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n){
            return new int[][]{};
        }
        int ind = 0;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; ++i){
            for (int j = 0; j < n ;++j){
                ans[i][j] = original[ind++];
            }
        }
        return ans;
    }
}
