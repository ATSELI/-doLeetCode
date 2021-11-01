package 剑指offer.offer53_2;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/14 21:33
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，
 * 并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，
 * 请找出这个数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        int[] i = {0,1,3};
        Solution solution = new Solution();
        int i1 = solution.missingNumber(i);
    }
    // 补位法,我的
    // public int missingNumber(int[] nums) {
    //     int[] result = new int[nums.length + 1];
    //     System.out.println(result.length);
    //     for (int num : nums) {
    //         result[num] = num;
    //     }
    //     for (int i = 0; i < result.length; i++){
    //         if (i != result[i]){
    //             return i;
    //         }
    //     }
    //     return 0;
    // }

    //大佬,二分法
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }


    // 作者：jyd
    // 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/solution/mian-shi-ti-53-ii-0n-1zhong-que-shi-de-shu-zi-er-f/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


}
