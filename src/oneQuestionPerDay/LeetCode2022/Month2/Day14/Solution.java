package oneQuestionPerDay.LeetCode2022.Month2.Day14;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/2/14 0:26
 * 给你一个仅由整数组成的有序数组，其中每个元素都会出现两次，唯有一个数只会出现一次。
 *
 * 请你找出并返回只出现一次的那个数。
 *
 * 你设计的解决方案必须满足 O(log n) 时间复杂度和 O(1) 空间复杂度。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-element-in-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (mid % 2 == 0){
                if (mid + 1 < nums.length && nums[mid] == nums[mid + 1]) l = mid;
                else r = mid - 1;
            }else {
                if (mid - 1 >= 0 && nums[mid] == nums[mid - 1]) l = mid;
                else r = mid - 1;
            }
        }
        return nums[l];
    }
}
