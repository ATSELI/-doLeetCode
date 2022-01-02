package oneQuestionPerDay.LeetCode20211203;

import java.util.Arrays;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/12/3 19:17
 * 给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组：
 *
 * 选择某个下标 i并将 nums[i] 替换为 -nums[i] 。
 * 重复这个过程恰好 k 次。可以多次选择同一个下标 i 。
 *
 * 以这种方式修改数组后，返回数组 可能的最大和 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        if (nums.length == 0){
            return 0;
        }
        int i = 0;
        while (i < k){
            Arrays.sort(nums);
            nums[0] = -nums[0];
            i++;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
