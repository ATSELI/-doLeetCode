package 剑指offer2.offer61;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/29 13:27
 * 给定两个以升序排列的整数数组 nums1 和 nums2,以及一个整数 k。
 * 定义一对值(u,v)，其中第一个元素来自nums1，第二个元素来自 nums2。
 * 请找到和最小的 k个数对(u1,v1), (u2,v2) ... (uk,vk)。
 * 示例 1:
 * 输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
 * 输出: [1,2],[1,4],[1,6]
 * 解释: 返回序列中的前 3 对数：
 *     [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 * 示例 2:
 * 输入: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
 * 输出: [1,1],[1,1]
 * 解释: 返回序列中的前 2 对数：
 *     [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
 * 示例 3:
 * 输入: nums1 = [1,2], nums2 = [3], k = 3
 * 输出: [1,3],[2,3]
 * 解释: 也可能序列中所有的数对都被返回:[1,3],[2,3]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qn8gGX
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<List<Integer>> queue = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return (o2.get(0) + o2.get(1)) - (o1.get(0) + o1.get(1));
            }
        });
        for (int i : nums1) {
            for (int j : nums2) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                queue.offer(list);
                if (queue.size() > k) {
                    queue.poll();
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        while (!queue.isEmpty()){
            list.add(queue.poll());
        }
        return list;
    }
}
