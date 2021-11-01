package 剑指offer2.offer23_;

import common.ListNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/14 20:19
 * 给定两个单链表的头节点headA 和 headB ，请找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3u1WK4
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A == null ? headB : A.next;
            B = B == null ? headA: B.next;
        }
        return A;
    }
}
