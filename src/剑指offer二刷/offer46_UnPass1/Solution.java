package 剑指offer二刷.offer46_UnPass1;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/24 0:36
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
 * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * 示例 1:
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     solution.translateNum(12812215);
    // }
    public int translateNum(int num) {
        // lastNum拿到倒数第一个数,secondLast储存倒数第二个数,用纸笔计算很容易得到规律,
        // 第一个数<=2时,有1中可能,第二个<=2时有2种,第三个<=2时有1+2=3,第四个<=2时有2+3=5中(就是个斐波那契数列)
        int pre = 1, cur = 1, lastNum = num % 10, secondNum;
        while (num != 0) {
            num /= 10;
            secondNum = num % 10;
            int sum = secondNum * 10 + lastNum;
            int temp = (sum >= 10 && sum <= 25) ? pre + cur : cur;
            pre = cur;
            cur = temp;
            lastNum = secondNum;
        }
        return cur;
    }
}
