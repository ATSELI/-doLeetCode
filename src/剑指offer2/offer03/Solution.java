package 剑指offer2.offer03;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/5 20:15
 * 给定一个非负整数 n ，请计算 0 到 n 之间的每个数字的二进制表示中 1 的个数，并输出一个数组。
 * 示例 1:
 * <p>
 * 输入: n = 2
 * 输出: [0,1,1]
 * 解释:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 示例2:
 * <p>
 * 输入: n = 5
 * 输出: [0,1,1,2,1,2]
 * 解释:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/w3tCBm
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countBits(10);
    }

    // public int[] countBits(int n) {
    //     int sta = 0;
    //     int[] res = new int[n + 1];
    //     for (int i = 0; i <= n; i++){
    //         int rec = i, tmp = i;
    //         while (tmp > 0){
    //             if (tmp % 2 == 1){
    //                 sta ++;
    //             }
    //             tmp /= 2;
    //         }
    //         res[rec] = sta;
    //         sta = 0;
    //     }
    //     return res;
    // }

    //大佬
    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if ((i & 1) == 0) { //偶数
                ans[i] = ans[i >> 1];
            } else { //奇数
                ans[i] = ans[i - 1] + 1;
            }
        }
        return ans;
    }

    // 作者：ddwuya
    // 链接：https://leetcode-cn.com/problems/w3tCBm/solution/li-yong-qi-ou-xing-zhi-by-chenhangaj-sixd/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
