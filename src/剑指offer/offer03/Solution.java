package 剑指offer.offer03;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/12 15:42
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */
public class Solution {
    // 我的
    /*public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return 0;
    }*/

    // 大佬的
    // 1 hash
    // public int findRepeatNumber(int[] nums) {
    //     Set<Integer> set = new HashSet<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (set.contains(nums[i])){
    //             return nums[i];
    //         }else {
    //             set.add(nums[i]);
    //         }
    //     }
    //     return -1;
    // }

    // 原地交换
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if (nums[i] == i){
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]]){
                return nums[i];
            }
            int tep = nums[i];
            nums[i] = nums[tep];
            nums[tep] = tep;
        }
        return -1;
    }
}
