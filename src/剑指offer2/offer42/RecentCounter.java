package 剑指offer2.offer42;

import javax.management.Query;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/22 12:41
 * 写一个RecentCounter类来计算特定时间范围内最近的请求。
 * 请实现 RecentCounter 类：
 * RecentCounter() 初始化计数器，请求数为 0 。
 * int ping(int t) 在时间 t 添加一个新请求，其中 t 表示以毫秒为单位的某个时间，并返回过去 3000 毫秒内发生的所有请求数（包括新请求）。
 * 确切地说，返回在 [t-3000, t] 内发生的请求数。
 * 保证 每次对 ping 的调用都使用比之前更大的 t 值。
 * 示例：
 * 输入：
 * inputs = ["RecentCounter", "ping", "ping", "ping", "ping"]
 * inputs = [[], [1], [100], [3001], [3002]]
 * 输出：
 * [null, 1, 2, 3, 3]
 * 解释：
 * RecentCounter recentCounter = new RecentCounter();
 * recentCounter.ping(1);     // requests = [1]，范围是 [-2999,1]，返回 1
 * recentCounter.ping(100);   // requests = [1, 100]，范围是 [-2900,100]，返回 2
 * recentCounter.ping(3001);  // requests = [1, 100, 3001]，范围是 [1,3001]，返回 3
 * recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002]，范围是 [2,3002]，返回 3
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/H8086Q
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RecentCounter {
    // public static void main(String[] args) {
    //     RecentCounter recentCounter = new RecentCounter();
    //     recentCounter.ping(1);
    //     recentCounter.ping(100);
    //     recentCounter.ping(3001);
    //     recentCounter.ping(3002);
    // }
    // start 表示上一次查询最开头的数下标
    // private int start;
    // end 表示当前下标
    // private int end;
    // LinkedList<Integer> queue;
    // public RecentCounter() {
    //     start = 0;
    //     end = 0;
    //     queue = new LinkedList<>();
    // }
    //
    // public int ping(int t) {
    //     queue.add(t);
    //     end = queue.size();
    //     int med = start;
    //     while (med < end){
    //         if (queue.get(med) >= t - 3000 && queue.get(med) <=t){
    //             break;
    //         }
    //         med++;
    //     }
    //     start = med;
    //     return end - start + 1;
    // }

    private Deque<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.offerLast(t);
        while (q.peekFirst() < t - 3000) {
            q.pollFirst();
        }
        return q.size();
    }

    // 作者：lcbin
    // 链接：https://leetcode-cn.com/problems/H8086Q/solution/doocskai-yuan-she-qu-python3-java-c-go-s-ip9s/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
