package 剑指offer2.offer11_;

import java.util.HashMap;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/8 11:36
 * 给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 * 示例 1:
 * <p>
 * 输入: nums = [0,1]
 * 输出: 2
 * 说明: [0, 1] 是具有相同数量 0 和 1 的最长连续子数组。
 * 示例 2:
 * <p>
 * 输入: nums = [0,1,0]
 * 输出: 2
 * 说明: [0, 1] (或 [1, 0]) 是具有相同数量 0 和 1 的最长连续子数组。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/A1NYOS
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 题解
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // 初始化(假装index = 0前面还有一个,后面这才好加)
        map.put(0, -1);
        int pre_sum = 0;
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            pre_sum += nums[i] == 0 ? -1 : 1;
            if (map.containsKey(pre_sum)) {
                ret = Math.max(ret, i - map.get(pre_sum));
            } else {
                map.put(pre_sum, i);
            }
        }
        return ret;
    }
    //
    // 作者：qingfengpython
    // 链接：https://leetcode-cn.com/problems/A1NYOS/solution/shua-chuan-jian-zhi-offer-day07-shu-zu-i-4q9c/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
