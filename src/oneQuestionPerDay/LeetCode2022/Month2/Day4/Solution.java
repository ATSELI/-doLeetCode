package oneQuestionPerDay.LeetCode2022.Month2.Day4;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/2/4 19:55
 * 给你一个数组 rectangles ，其中 rectangles[i] = [li, wi] 表示第 i 个矩形的长度为 li 、宽度为 wi 。
 *
 * 如果存在 k 同时满足 k <= li 和 k <= wi ，就可以将第 i 个矩形切成边长为 k 的正方形。例如，矩形 [4,6] 可以切成边长最大为 4 的正方形。
 *
 * 设 maxLen 为可以从矩形数组 rectangles 切分得到的 最大正方形 的边长。
 *
 * 请你统计有多少个矩形能够切出边长为 maxLen 的正方形，并返回矩形 数目 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-rectangles-that-can-form-the-largest-square
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0, num = 0, side;
        for (int[] rectangle : rectangles) {
            side = Math.min(rectangle[0], rectangle[1]);
            if (side == max) {
                num++;
            }
            if (side > max) {
                num = 1;
                max = side;
            }

        }
        return num;
    }
}
