package 剑指offer2.offer08;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/7 20:37
 * 给定一个含有n个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 * 示例 1：
 *
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组[4,3]是该条件下的长度最小的子数组。
 * 示例 2：
 *
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * 示例 3：
 *
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/2VG8Kg
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.minSubArrayLen(7,new int[]{2,3,1,2,4,3});
    }
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE, index = 0, count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > target){
                return 1;
            }
            sum += nums[i];
            count ++;
            while (sum >= target){
                min = Math.min(count, min);
                count --;
                sum = sum - nums[index];
                index ++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
