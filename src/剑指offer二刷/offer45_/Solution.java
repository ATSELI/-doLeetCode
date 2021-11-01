package 剑指offer二刷.offer45_;

import java.util.Arrays;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/30 0:55
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/
 */
public class Solution {
    public String minNumber(int[] nums) {
        String[] ans = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ans, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder builder = new StringBuilder();
        for (String an : ans) {
            builder.append(an);
        }
        return builder.toString();
    }
}
