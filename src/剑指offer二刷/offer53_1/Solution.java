package 剑指offer二刷.offer53_1;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/18 15:22
 * 统计一个数字在排序数组中出现的次数。
 * https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 */
public class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        int right = l;
        if (r >= 0 && nums[r] != target){
            return 0;
        }
        l = 0;
        r = nums.length - 1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        int left = l;
        return right - left;
    }
    // 作者：jyd
    // 链接：https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/solution/mian-shi-ti-53-i-zai-pai-xu-shu-zu-zhong-cha-zha-5/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
