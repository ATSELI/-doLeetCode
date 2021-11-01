package 剑指offer.offer21;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/4 18:41
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 * 示例：
 * 输入：nums =[1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 辅助数组 双O(n)
    // public int[] exchange(int[] nums) {
    //     int[] res = new int[nums.length];
    //     int fir = 0, end = nums.length - 1;
    //     for (int num : nums) {
    //         if (num % 2 != 0) {
    //             res[fir] = num;
    //             fir++;
    //         } else {
    //             res[end] = num;
    //             end--;
    //         }
    //     }
    //     return res;
    // }

    // 头尾双指针
    public int[] exchange(int[] nums) {
        int op = 0, ed = nums.length - 1;
        while (op < ed) {
            if (nums[op] % 2 == 0) {
                if (nums[ed] % 2 == 1) {
                    int tmp = nums[op];
                    nums[op] = nums[ed];
                    nums[ed] = tmp;
                }else {
                    ed --;
                }
            }else {
                op++;
            }
        }
        return nums;
    }
}
