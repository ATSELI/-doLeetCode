package 剑指offer二刷.offer66_;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/11/7 13:33
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中B[i] 的值是数组 A 中除了下标 i 以外的元素的积,
 * 即B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] constructArr(int[] a) {
        int len = a.length;
        int tmp = 1;
        if (len == 0){
            return new int[]{};
        }
        int[] b = new int[len];
        b[0] = 1;
        for (int i = 1; i < len; ++i){
            b[i] = b[i - 1] * a[i - 1];
        }
        for (int i = len - 2; i >= 0; --i){
            tmp *= a[i + 1];
            b[i] *= tmp;
        }
        return b;
    }
}
