package 剑指offer2.offer69;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/4 16:23
 * 符合下列属性的数组 arr 称为 山峰数组（山脉数组） ：
 *
 * arr.length >= 3
 * 存在 i（0 < i< arr.length - 1）使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 给定由整数组成的山峰数组 arr ，
 * 返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i，即山峰顶部。
 * 示例 1：
 * 输入：arr = [0,1,0]
 * 输出：1
 * 示例 2：
 * 输入：arr = [1,3,5,4,2]
 * 输出：2
 * 示例 3：
 * 输入：arr = [0,10,5,2]
 * 输出：1
 * 示例 4：
 * 输入：arr = [3,4,5,1]
 * 输出：2
 * 示例 5：
 * 输入：arr = [24,69,100,99,79,78,67,36,26,19]
 * 输出：2
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/B1IidL
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 官方二分法查找
    public int peakIndexInMountainArray(int[] arr) {
        int l = 1, r = arr.length - 2, ans = 0;
        while (l <= r){
            int mid = (l + r) >> 1;
            if (arr[mid] < arr[mid + 1]){
                l = mid + 1;
            }else {
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
    // 滑动指针
    // public int peakIndexInMountainArray(int[] arr) {
    //     int l = 0, r = arr.length - 1;
    //     while (l < r){
    //         if (arr[l] < arr[l + 1]){
    //             ++l;
    //         }
    //         if (arr[r] < arr[r - 1]){
    //             --r;
    //         }
    //     }
    //     return l;
    // }
}
