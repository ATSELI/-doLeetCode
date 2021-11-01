package 剑指offer2.offer57_;

import java.util.TreeSet;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/28 10:33
 * 给你一个整数数组 nums 和两个整数k 和 t 。
 * 请你判断是否存在 两个不同下标 i 和 j，使得abs(nums[i] - nums[j]) <= t ，同时又满足 abs(i - j) <= k 。
 * 如果存在则返回 true，不存在返回 false。
 * 示例1：
 * 输入：nums = [1,2,3,1], k = 3, t = 0
 * 输出：true
 * 示例 2：
 * 输入：nums = [1,0,1,1], k = 1, t = 2
 * 输出：true
 * 示例 3：
 * 输入：nums = [1,5,9,1,5,9], k = 2, t = 3
 * 输出：false
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/7WqeDu
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
 public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,5,9,1,5,9};
        System.out.println(solution.containsNearbyAlmostDuplicate(nums, 2, 3));
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i){
            Long floor = treeSet.floor((long) nums[i]);
            if (floor != null && Math.abs(floor - nums[i]) <= t){
                return true;
            }
            Long ceiling = treeSet.ceiling((long) nums[i]);
            if (ceiling != null && Math.abs(ceiling - nums[i]) <= t){
                return true;
            }
            treeSet.add((long) nums[i]);
            if (i >= k){
                treeSet.remove((long)nums[i - k]);
            }
        }
        return false;
    }
}
