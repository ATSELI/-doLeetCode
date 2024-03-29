package 剑指offer.offer10_2;


/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/26 1:24
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * // 青蛙跳阶问题就是斐波那契数列问题 f(n) = f(n - 1) + f(n - 2)
 *
 * 输入：n = 2
 * 输出：2
 * 输入：n = 7
 * 输出：21
 * 输入：n = 0
 * 输出：1

 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Solution {
    public int numWays(int n) {
        // 第0阶和第1阶都是一次
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

}
