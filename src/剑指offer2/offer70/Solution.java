package 剑指offer2.offer70;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/5 17:33
 * 给定一个只包含整数的有序数组 nums，每个元素都会出现两次，唯有一个数只会出现一次，请找出这个唯一的数字。
 * 示例 1:
 * 输入: nums = [1,1,2,3,3,4,4,8,8]
 * 输出: 2
 * 示例 2:
 * 输入: nums =  [3,3,7,7,10,11,11]
 * 输出: 10
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/skFtm2
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    //https://www.bilibili.com/video/BV1uU4y1s7Mb?from=search&seid=13004131946948894464&spm_id_from=333.337.0.0
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length;
        //因为返回的结果是r = mid时候的结果,可以自己用数据试试
        while (l < r){
            int mid = l + (r - l) / 2;
            if (mid % 2 == 1){
                // 一定要确保此时mid为偶数
                mid --;
            }
            if (nums[mid] == nums[mid + 1]){
                l = mid + 2;
            }else {
                r = mid;
            }
        }
        return nums[l];
        // int n = nums.length, l = 0, r = n - 1;
        // int ans = -1;
        // while (l <= r) {
        //     // 排除了最后一个数后（可以理解为把目标数排除了）才有看下标找ans所在位置前后的操作。这样更好理解。
        //     int mid = l + (r - l) / 2;
        //     if (mid < n - 1 && nums[mid] == nums[mid + 1]) {
        //         if (mid % 2 == 0) {
        //             l = mid + 2;
        //         } else {
        //             r = mid - 1;
        //         }
        //     } else if (mid > 0 && nums[mid] == nums[mid - 1]) {
        //         if (mid % 2 == 0) {
        //             r = mid - 2;
        //         } else {
        //             l = mid + 1;
        //         }
        //     } else {
        //         ans = nums[mid];
        //         break;
        //     }
        // }
        // // 由于题目的性质，ans一定会被找到，所以不会返回-1
        // return ans;
    }

    // 作者：vanilla111
    // 链接：https://leetcode-cn.com/problems/skFtm2/solution/java-xiao-lu-100yi-bu-bu-dai-ni-er-fen-b-hwqa/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。



}
