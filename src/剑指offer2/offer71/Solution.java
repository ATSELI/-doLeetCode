package 剑指offer2.offer71;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/8 23:08
 * 给定一个正整数数组w ，其中w[i]代表下标 i的权重（下标从 0 开始），请写一个函数pickIndex，
 * 它可以随机地获取下标 i，选取下标 i的概率与w[i]成正比。
 *
 * 例如，对于 w = [1, 3]，挑选下标 0 的概率为 1 / (1 + 3)= 0.25 （即，25%），而选取下标 1 的概率为 3 / (1 + 3)= 0.75（即，75%）。
 * 也就是说，选取下标 i 的概率为 w[i] / sum(w) 。
 * 示例 1：
 * 输入：
 * inputs = ["Solution","pickIndex"]
 * inputs = [[[1]],[]]
 * 输出：
 * [null,0]
 * 解释：
 * Solution solution = new Solution([1]);
 * solution.pickIndex(); // 返回 0，因为数组中只有一个元素，所以唯一的选择是返回下标 0。
 * 示例 2：
 * 输入：
 * inputs = ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
 * inputs = [[[1,3]],[],[],[],[],[]]
 * 输出：
 * [null,1,1,1,1,0]
 * 解释：
 * Solution solution = new Solution([1, 3]);
 * solution.pickIndex(); // 返回 1，返回下标 1，返回该下标概率为 3/4 。
 * solution.pickIndex(); // 返回 1
 * solution.pickIndex(); // 返回 1
 * solution.pickIndex(); // 返回 1
 * solution.pickIndex(); // 返回 0，返回下标 0，返回该下标概率为 1/4 。
 * 由于这是一个随机问题，允许多个答案，因此下列输出都可以被认为是正确的:
 * [null,1,1,1,1,0]
 * [null,1,1,1,1,1]
 * [null,1,1,1,0,0]
 * [null,1,1,1,0,1]
 * [null,1,0,1,0,0]
 * ......
 * 诸若此类。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cuyjEf
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Math.random());
    }
    // 前缀和
    int[] pre;
    int total;

    public Solution(int[] w) {
        pre = new int[w.length];
        pre[0] = w[0];
        for (int i = 1; i < w.length; ++i) {
            pre[i] = pre[i - 1] + w[i];
        }
        total = Arrays.stream(w).sum();
    }

    public int pickIndex() {
        int x = (int) (Math.random() * total) + 1;
        return binarySearch(x);
    }

    private int binarySearch(int x) {
        int low = 0, high = pre.length - 1;
        while (low < high) {
            int mid = (high + low) / 2;
            // int mid = (high - low) / 2 + low;
            if (pre[mid] < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // 作者：LeetCode-Solution
    // 链接：https://leetcode-cn.com/problems/cuyjEf/solution/an-quan-zhong-sheng-cheng-sui-ji-shu-by-bosxd/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
