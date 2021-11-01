package 剑指offer二刷.offer42_Pass1;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/23 0:25
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 * 示例1:
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释:连续子数组[4,-1,2,1] 的和最大，为6。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        int[] test = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        solution.maxSubArray(test);
    }
    // public int maxSubArray(int[] nums) {
    //     int max = nums[0];
    //     for (int i = 1; i < nums.length; i++) {
    //         nums[i] = nums[i] + nums[i - 1] > 0 ? Math.max(nums[i] + nums[i - 1], nums[i]) : nums[i];
    //         max = Math.max(nums[i], max);
    //     }
    //     return max;
    // }
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(0, nums[i - 1]);
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
