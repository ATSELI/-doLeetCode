package 剑指offer二刷.offer61;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/30 15:07
 * 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，
 * 即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public boolean isStraight(int[] nums) {
    //     Arrays.sort(nums);
    //     int zero = 0;
    //     if (nums[0] == 0){
    //         zero ++;
    //     }
    //     for (int i = 1; i < nums.length; i++){
    //         if (nums[i] == 0){
    //             zero ++;
    //             continue;
    //         }
    //         if ((i != 4 && nums[i] == 13) || (nums[i] == nums[i - 1])){
    //             return false;
    //         }
    //         if (nums[i] != nums[i - 1] + 1 && nums[i - 1] != 0){
    //             if (zero != 0){
    //                 nums[i - 2] = nums[i - 1];
    //                 nums[i - 1] = nums[i - 1] + 1;
    //                 zero --;
    //                 i = i - 1;
    //             }else {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    // k神
    public boolean isStraight(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        int max = 0, min = 14;
        for (int num : nums) {
            if (num == 0){
                continue;
            }
            if (ans.contains(num)){
                return false;
            }
            max = Math.max(max, num);
            min = Math.min(min, num);
            ans.add(num);
        }
        return max - min <= 5;
    }

}
