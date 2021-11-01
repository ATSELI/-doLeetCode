package 剑指offer2.offer22;

import common.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/14 18:09
 * 给定一个链表，返回链表开始入环的第一个节点。 从链表的头节点开始沿着 next 指针进入环的第一个节点为环的入口节点。如果链表无环，则返回 null。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
 *
 * 说明：不允许修改给定的链表。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/c32eOV
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public ListNode detectCycle(ListNode head) {
        // 我的
        // Map<ListNode, Integer> map = new HashMap<>();
        // // ListNode res = head;
        // while (head != null && !map.containsKey(head)){
        //     map.put(head, head.val);
        //     head = head.next;
        // }
        // if (head == null){
        //     return null;
        // }else {
        //     return head;
        // }
    // }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            // fast一次走两格,slow一次有一格
            fast = fast.next.next;
            slow = slow.next;
            // 找到slow和fast相遇的点
            if (fast == slow) break;
        }
        ListNode sim = head;
        //从头开始走,再走slow格,slow就能和sim相遇，此时slow相当于走了fast的距离，而xim相当于走了slow 的距离
        while (slow != sim) {
            slow = slow.next;
            sim = fast.next;
        }
        return fast;
    }

}
