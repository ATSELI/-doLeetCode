package 剑指offer二刷.offer57;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/27 13:16
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                left++;
            }else if (nums[left] + nums[right] > target){
                right--;
            }else {
                return new int[]{nums[left], nums[right]};
            }
        }
        return new int[]{};
    }
}
