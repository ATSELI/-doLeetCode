package oneQuestionPerDay.LeetCode2022.Month1.Day13;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/1/13 14:22
 * 给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
 * <p>
 * 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dominantIndex(new int[]{0, 0, 3, 2}));
    }
    public int dominantIndex(int[] nums) {
        if (nums.length == 1){
            return 0;
        }
        int maxNum = Integer.MIN_VALUE, secNum = Integer.MIN_VALUE, index = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (maxNum < nums[i]){
                secNum = maxNum;
                maxNum = nums[i];
                index = i;
            }else {
                if (secNum < nums[i]){
                    secNum = nums[i];
                }
            }
        }
        if (maxNum >= secNum * 2){
            return index;
        }else {
            return -1;
        }
    }
}
