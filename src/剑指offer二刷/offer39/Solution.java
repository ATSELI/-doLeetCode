package 剑指offer二刷.offer39;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/11/7 13:07
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 */
public class Solution {
    // public int majorityElement(int[] nums) {
    //     int length = nums.length / 2, res = 0;
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for (int num : nums) {
    //         int sum = map.getOrDefault(num, 0) + 1;
    //         map.put(num, sum);
    //         if (map.get(num) > length){
    //             res = num;
    //         }
    //
    //     }
    //     return res;
    // }

    public int majorityElement(int[] nums) {
        int x = 0, vote = 0;
        for (int num : nums) {
            if (vote == 0){
                x = num;
            }
            if (num == x){
                vote ++;
            }else {
                vote --;
            }
        }
        return x;
    }
}
