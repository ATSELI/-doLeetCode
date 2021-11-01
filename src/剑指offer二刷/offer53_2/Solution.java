package 剑指offer二刷.offer53_2;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/19 1:46
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if (mid == nums[mid]){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return nums[l];
    }
}
