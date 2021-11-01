package 剑指offer2.offer10_;

import java.util.HashMap;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/8 8:58
 * 给定一个整数数组和一个整数k ，请找到该数组中和为k的连续子数组的个数。
 * 示例 1 :
 * <p>
 * 输入:nums = [1,1,1], k = 2
 * 输出: 2
 * 解释: 此题 [1,1] 与 [1,1] 为两种不同的情况
 * 示例 2:
 * <p>
 * 输入:nums = [1,2,3], k = 3
 * 输出: 2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/QTMn0o
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.subarraySum(new int[]{1,1,1,1,1,2}, 2);
    }
    public int subarraySum(int[] nums, int k) {
        // https://www.bilibili.com/video/BV13t4y1y7ya?from=search&seid=7997506765769827356&spm_id_from=333.337.0.0
        int pre_sum = 0;
        int ret = 0;
        // j - i 的和 = nums[i] - nums[j-1],故要想知道num[i]之前有几个相加为k的数组,只需要知道num[i] - k在map中存有几个便可
        HashMap<Integer, Integer> map = new HashMap<>();
        // 初始化,防止num[i]便为k了

        map.put(0, 1);
        for (int i : nums) {
            pre_sum += i;
            ret += map.getOrDefault(pre_sum - k, 0);
            map.put(pre_sum, map.getOrDefault(pre_sum, 0) + 1);
        }
        return ret;
    }
    //
    // 作者：qingfengpython
    // 链接：https://leetcode-cn.com/problems/QTMn0o/solution/shua-chuan-jian-zhi-offer-day07-shu-zu-i-jdnu/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
