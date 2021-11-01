package 剑指offer2.offer75;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/12 14:40
 * 给定两个数组，arr1 和arr2，
 * arr2中的元素各不相同
 * arr2 中的每个元素都出现在arr1中
 * 对 arr1中的元素进行排序，使 arr1 中项的相对顺序和arr2中的相对顺序相同。
 * 未在arr2中出现过的元素需要按照升序放在arr1的末尾。

 * 示例：
 * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * 输出：[2,2,2,1,4,3,3,9,6,7,19]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/0H97ZC
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        for (int i : arr1) {
            max = Math.max(max, i);
        }
        int[] frequency = new int[max + 1];
        for (int i : arr1) {
            frequency[i]++;
        }
        int[] ans = new int[arr1.length];
        int index = 0;
        for (int i : arr2) {
            for (int j = 0; j  < frequency[i]; j++) {
                ans[index++] = i;
            }
            frequency[i] = 0;
        }
        for (int i = 0; i <= max; ++i){
            for (int j = 0; j < frequency[i]; ++j){
                ans[index++] = i;
            }
        }
        return ans;
    }
}
