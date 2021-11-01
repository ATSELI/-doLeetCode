package 剑指offer二刷.offer63;

import java.util.Scanner;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/22 9:23
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
    public int maxProfit(int[] prices) {

        int max = 0, buy = Integer.MAX_VALUE;
        for (int price : prices) {
            buy = Math.min(buy, price);
            if (price > buy){
                max = Math.max(max, price - buy);
            }
        }
        return max;
    }
}
