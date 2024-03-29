package oneQuestionPerDay.LeetCode2022.Month1.Day2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2022/1/2 15:09
 * @description
 * 列表 arr 由在范围 [1, n] 中的所有整数组成，并按严格递增排序。请你对 arr 应用下述算法：
 *
 * 从左到右，删除第一个数字，然后每隔一个数字删除一个，直到到达列表末尾。
 * 重复上面的步骤，但这次是从右到左。也就是，删除最右侧的数字，然后剩下的数字每隔一个删除一个。
 * 不断重复这两步，从左到右和从右到左交替进行，直到只剩下一个数字。
 * 给你整数 n ，返回 arr 最后剩下的数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/elimination-game
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int lastRemaining(int n) {
        // a1 首元素
        int a1 = 1;
        // k是一个标识位,用来判断正向or反向, cnt是还有多少个数字,step是公差
        int k = 0, cnt = n, step = 1;
        while (cnt > 1){
            if (k % 2 == 0){
                a1 = a1 + step;
            }else {
                a1 = (cnt % 2 == 0) ? a1 : a1 + step;
            }
            k ++;
            cnt = cnt >> 1;
            step = step << 1;
        }
        return a1;
    }
}
