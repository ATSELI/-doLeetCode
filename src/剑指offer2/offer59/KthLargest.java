package 剑指offer2.offer59;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/28 20:03
 * 设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。
 * 请实现 KthLargest类：
 * KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。
 * int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。
 * 示例：
 * 输入：
 * ["KthLargest", "add", "add", "add", "add", "add"]
 * [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
 * 输出：
 * [null, 4, 5, 5, 8, 8]
 * 解释：
 * KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
 * kthLargest.add(3);   // return 4
 * kthLargest.add(5);   // return 5
 * kthLargest.add(10);  // return 5
 * kthLargest.add(9);   // return 8
 * kthLargest.add(4);   // return 8
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jBjn9C
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class KthLargest {
    // List<Integer> list;
    // int k;
    // public KthLargest(int k, int[] nums) {
    //     list = new ArrayList<>();
    //     for (Integer num: nums){
    //         list.add(num);
    //     }
    //     this.k = k;
    // }
    //
    // public int add(int val) {
    //     list.add(val);
    //     Collections.sort(list);
    //     return list.get(list.size() - k);
    // }
    private Queue<Integer> queue;
    private int k;
    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>();
        this.k = k;
        for (int num: nums){
            add(num);
        }
    }

    public int add(int val) {
        queue.offer(val);
        if (queue.size() > k){
            queue.poll();
        }
        return queue.peek();
    }

}
