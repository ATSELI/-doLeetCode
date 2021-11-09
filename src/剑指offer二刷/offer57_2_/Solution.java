package 剑指offer二刷.offer57_2_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/11/7 19:25
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
    }
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int l = 1, r = 2, sum = 3;
        while (l < r){
            if (sum == target){
                int[] a = new int[r - l + 1];
                for (int i = l; i <= r; i++){
                    a[i - l] = i;
                }
                res.add(a);
            }
            if (sum >= target){
                sum -= l;
                l++;
            }else {
                r++;
                sum += r;
            }
        }
        return res.toArray(new int[0][]);
    }
}
