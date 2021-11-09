package 剑指offer二刷.offer16_;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/11/3 23:13
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 *
 * https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 */
public class Solution {
    public double myPow(double x, int n) {
        if (x == 0){
            return 0;
        }
        long num = n;
        double res = 1.0;
        if (num < 0){
            x = 1 / x;
            num = -num;
        }
        while (num > 0){
            if ((num & 1) == 1){
                res *= x;
            }
            x *= x;
            num >>= 1;
        }
        return res;
    }

}
