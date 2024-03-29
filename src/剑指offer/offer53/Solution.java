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
    // 我的
    // public int search(int[] nums, int target) {
    //     int i = 0;
    //     for (int j = 0; j < nums.length; j++) {
    //         if (nums[j] > target){
    //             break;
    //         }
    //         if (target == nums[j]){
    //             i++;
    //         }
    //     }
    //     return i;
    // }

    /** 大佬, 二分法*/
    public int search(int[] nums, int target) {
        // 搜索右边界 right
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= target) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        int right = i;
        // 若数组中无 target ，则提前返回
        if(j >= 0 && nums[j] != target) {
            return 0;
        }
        // 搜索左边界 right
        i = 0; j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] < target) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        int left = j;
        return right - left - 1;
    }

    // 作者：jyd
    // 链接：https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/solution/mian-shi-ti-53-i-zai-pai-xu-shu-zu-zhong-cha-zha-5/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
