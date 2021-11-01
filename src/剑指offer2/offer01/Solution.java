package 剑指offer2.offer01;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/5 10:40
 * 给定两个整数 a 和 b ，求它们的除法的商 a/b ，要求不得使用乘号 '*'、除号 '/' 以及求余符号 '%' 。
 * // 看不懂,放弃
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(10000 << 2);
    }
    public int divide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }

        /*
            判断是否同号，同号则 结果为正数
         */
        boolean flag = false;
        if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
            flag = true;
        }

        long dividend = a > 0 ? -a : a;
        long divisor = b > 0 ? -b : b;
        if (dividend > divisor) {
            return 0;
        }
        /*
            计算 结果的绝对值
         */
        int result = 0;
        int shift = 31;
        while (dividend <= divisor) {
            // 左移相当于成2的shift次方
            while (dividend > divisor << shift) {
                shift--;
            }
            dividend -= divisor << shift;
            result += 1 << shift;
        }

        return flag ? result : -result;
    }

    // public int divide(int a, int b) {
    //     if (a == 0){
    //         return 0;
    //     }
    //     int res = 0;
    //     if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
    //         // a = Math.abs(a);
    //         // b = Math.abs(b);
    //         if (a >= 0){
    //             while (a >= 0) {
    //                 a = a - b;
    //                 res++;
    //             }
    //             return res - 1;
    //         }else {
    //             while (a <= 0){
    //                 a = a + b;
    //                 res ++;
    //             }
    //             return res - 1;
    //         }
    //
    //     } else {
    //         if (a < 0) {
    //             while (a <= 0) {
    //                 a = a + b;
    //                 res--;
    //             }
    //             return res + 1;
    //         } else {
    //             while (a >= 0) {
    //                 a = a + b;
    //                 res--;
    //             }
    //             return res + 1;
    //         }
    //     }
    // }

}
