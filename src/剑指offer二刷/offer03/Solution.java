package 剑指offer二刷.offer03;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/18 15:05
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 数组计数
    // public int findRepeatNumber(int[] nums) {
    //     int[] ans = new int[nums.length];
    //     for (int num : nums) {
    //         ans[num]++;
    //         if (ans[num] > 1){
    //             return num;
    //         }
    //     }
    //     return -1;
    // }

    // 下标比较
    public int findRepeatNumber(int[] nums) {
        int i = 0, length = nums.length;
        while (i < length){
            if (nums[i] == i){
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]]){
                return nums[i];
            }else {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}
