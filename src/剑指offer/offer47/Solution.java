package 剑指offer.offer47;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/28 19:36
 * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
 * 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出:
 * 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
 */
public class Solution {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 1; i < m; i++){
            grid[i][0] = grid[i][0] + grid[i-1][0];
        }
        for (int i = 1; i < n; i++){
            grid[0][i] = grid[0][i-1] + grid[0][i];
        }
        for (int i = 1; i < m; i++){
            for (int j =1; j < n; j++){
                grid[i][j] = (grid[i-1][j] > grid[i][j-1]?grid[i-1][j]+grid[i][j]:grid[i][j-1] + grid[i][j]);
            }
        }
        return grid[m-1][n-1];
    }
}
