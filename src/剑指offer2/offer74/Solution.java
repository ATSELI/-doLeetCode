package 剑指offer2.offer74;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/11 19:05
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi]。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 * 示例 1：
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例2：
 * 输入：intervals = [[1,4],[4,5]]
 * 输出：[[1,5]]
 * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/SsGoHC
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public static void main(String[] args) {
    //     int[][] test = new int[][]{
    //             {5,2},{2,3},{8,4},{2,6}
    //     };
    //     Solution solution = new Solution();
    //     solution.merge(test);
    //     // System.out.println(test.length);
    //
    // }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 升序排序
                if (o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }else {
                    return o1[0] - o2[0];
                }
            }
        });
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int key = intervals[i][0], value = intervals[i][1];
            if (list.size() == 0 || list.get(list.size() - 1)[1] < key){
                list.add(new int[]{key, value});
            }else {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], value);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
