package 剑指offer2.offer21_;

import common.ListNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/13 23:09
 * 给定一个链表，删除链表的倒数第n个结点，并且返回链表的头结点。
 * 示例 1：
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/SLwz0R
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = new ListNode(0);
        fast.next = head;
        head = fast;
        ListNode slow = fast;
        // fast走到底n+1个位置
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        // slow到达倒数第n + 1个数
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head.next;
    }
}
