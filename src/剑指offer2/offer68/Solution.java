package 剑指offer2.offer68;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/30 9:37
 * 给定一个排序的整数数组 nums和一个整数目标值 target ，请在数组中找到target，
 * 并返回其下标。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * 示例 1:
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 示例2:
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * 示例 3:
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 * 示例 4:
 * 输入: nums = [1,3,5,6], target = 0
 * 输出: 0
 * 示例 5:
 * 输入: nums = [1], target = 0
 * 输出: 0
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/N6YdxV
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        return binary_search_left(nums, target);
    }

    public int binary_search_left(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    // 作者：Hanxin_Hanxin
    // 链接：https://leetcode-cn.com/problems/N6YdxV/solution/cpython3java-1diao-ku-2shou-lu-er-fen-xu-eio6/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
