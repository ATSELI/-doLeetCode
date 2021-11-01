package 剑指offer二刷.offer40;

import java.util.Arrays;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/31 1:34
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k >= arr.length){
            return arr;
        }
        Arrays.sort(arr);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
}
