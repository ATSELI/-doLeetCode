package 剑指offer.offer53;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/12 16:11]
 * 统计一个数字在排序数组中出现的次数
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 *
 */
public class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > target){
                break;
            }
            if (target == nums[j]){
                i++;
            }
        }
        return i;
    }
}
