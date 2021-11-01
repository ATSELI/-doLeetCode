package 剑指offer2.offer73_rebackStudy;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/9 23:55
 * 给定一个非负整数 x ，计算并返回 x 的平方根，即实现int sqrt(int x)函数。
 * 正数的平方根有两个，只输出其中的正数平方根。
 * 如果平方根不是整数，输出只保留整数的部分，小数部分将被舍去
 * 示例 1:
 * 输入: x = 4
 * 输出: 2
 * 示例 2:
 * 输入: x = 8
 * 输出: 2
 * 解释: 8 的平方根是 2.82842...，由于小数部分将被舍去，所以返回 2
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jJ0w9p
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 1, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long tmp = (long) mid * mid;
            if (tmp == x) {
                return mid;
            } else if (tmp > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l - 1;
    }

    // 作者：vanilla111
    // 链接：https://leetcode-cn.com/problems/jJ0w9p/solution/java-shui-yi-ge-ti-jie-zhu-yi-xi-jie-jiu-hivw/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
