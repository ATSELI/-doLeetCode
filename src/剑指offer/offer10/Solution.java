package 剑指offer.offer10;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/26 0:06
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 示例1
 * 输入：n = 2
 * 输出：1
 * 示例2
 * 输入：n = 5
 * 输出：5
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    //  动态规划
    // public int fib(int n) {
    //     int a = 0, b = 1, sum = 0;
    //     for (int i = 0; i < n; i++) {
    //         sum = (a + b) % 1000000007;
    //         a = b;
    //         b = sum;
    //     }
    //     return a;
    // }

    // 递归, 超时
    public int fib(int n) {
        if (n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
