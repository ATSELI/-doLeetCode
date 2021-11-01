package 剑指offer2.offer24;

import common.ListNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/14 20:57
 * 给定单链表的头节点 head ，请反转链表，并返回反转后的链表的头节点。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/UHnkqh
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
