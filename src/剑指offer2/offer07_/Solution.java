package 剑指offer2.offer07_;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/7 9:32
给定一个包含 n 个整数的数组nums，判断nums中是否存在三个元素a ，b ，c ，使得a + b + c = 0 ？请找出所有和为 0 且不重复的三元组。

示例 1:
输入：nums = [-1,0,1,2,-1,-4]
输出：[[-1,-1,2],[-1,0,1]]

示例 2：
输入：nums = []
输出：[]
示例 3：
输入：nums = [0]
输出：[]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/1fGaJU
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 技巧流
    // public List<List<Integer>> threeSum(int[] nums) {
    //
    //     if (nums == null || nums.length < 3){
    //         return new ArrayList<>();
    //     }
    //     List<List<Integer>> list = new ArrayList<>();
    //     Arrays.sort(nums);
    //     for (int i = 0; i < nums.length - 2; i++){
    //         if (i > 0 && nums[i] == nums[i - 1]){
    //             continue;
    //         }
    //         int target = -nums[i];
    //         int left = i + 1;
    //         int right = nums.length - 1;
    //         while (left < right){
    //             int sum = nums[left] + nums[right];
    //             if (sum == target){
    //                 list.add(Arrays.asList(nums[i], nums[left], nums[right]));
    //                 while (left < right && nums[left] == nums[++left]){
    //
    //                 }
    //                 while (left < right && nums[right] == nums[--right]){
    //
    //                 }
    //             }else if (target > sum){
    //                 left++;
    //             }else {
    //                 right --;
    //             }
    //         }
    //     }
    //     return list;
    // }


    // 老实set去重流
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums); // O(nlogn)

        // O(n^2)
        for (int i = 0; i < nums.length; i++) {
            // 在 i + 1 ... nums.length - 1 中查找相加等于 -nums[i] 的两个数
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList<>(res); // O(n)
    }
    //
    // 作者：tangweiqun
    // 链接：https://leetcode-cn.com/problems/1fGaJU/solution/jian-dan-yi-dong-javac-pythonjs-san-shu-nu6el/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
