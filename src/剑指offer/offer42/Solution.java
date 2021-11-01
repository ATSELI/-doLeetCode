package 剑指offer.offer42;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/28 14:49
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 *
 * 示例1:
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 */
public class Solution {
    // public int maxSubArray(int[] nums) {
    //     int sum = nums[0], max = nums[0];
    //     for (int i = 0; i < nums.length; i++){
    //         sum = Math.max(sum + nums[i], nums[i]);
    //         max = Math.max(max, sum);
    //         System.out.println(i + ": "  + max);
    //     }
    //     return max;
    // }

    // k神解法
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        // [-2,1,-3,4,-1,2,1,-5,4]
        for(int i = 1; i < nums.length; i++) {
            // 这里是直接在nums数组上修改,只要上一个数<0,证明加上也不会有我现在这个数打,故直接存本身就行了
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
