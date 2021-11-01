package 剑指offer2.offer09;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/8 0:01
给定一个正整数数组nums和整数 k，请找出该数组内乘积小于k的连续的子数组的个数。
示例 1:

输入: nums = [10,5,2,6], k = 100
输出: 8
解释: 8 个乘积小于 100 的子数组分别为: [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]。
需要注意的是 [10,5,2] 并不是乘积小于100的子数组。
示例 2:

输入: nums = [1,2,3], k = 0
输出: 0

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/ZVAVXX
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     solution.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100);
    // }
    // 复杂度较低，倒也可以用累成法
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int sum, count = 0;
        for (int i = 0; i < nums.length - 1; i++){
            sum = nums[i];
            if (sum > k){
                continue;
            }
            count++;
            for (int j = i + 1; j < nums.length; j++) {
                sum *= nums[j];
                if (sum >= k){
                    break;
                }
                count++;
            }
        }
        return nums[nums.length - 1] > k ? count : ++count;
    }
}
