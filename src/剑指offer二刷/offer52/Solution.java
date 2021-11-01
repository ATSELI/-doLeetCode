package 剑指offer二刷.offer52;

import common.ListNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/26 0:48
 * 输入两个链表，找出它们的第一个公共节点。
 * https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode up = headA, down = headB;
        while (up != down) {
            if (up == null) {
                up = headB;
                down = down.next;
                continue;
            }
            if (down == null) {
                down = headA;
                up = up.next;
                continue;
            }
            up = up.next;
            down = down.next;

        }
        return up;
    }

    // 化简
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode up = headA, down = headB;
        while (up != down) {
            up = up == null ? headB : up.next;
            down = down == null ? headA : down.next;
        }
        return up;
    }
}
