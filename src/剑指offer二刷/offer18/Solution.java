package 剑指offer二刷.offer18;

import common.ListNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/25 8:26
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null){
            return head;
        }
        ListNode rec = head, next = head.next;
        if (rec.val == val){
            return head.next;
        }
        while (next != null){
            if (next.val == val){
                rec.next = next.next;
                return head;
            }
            rec = next;
            next = next.next;
        }
        return head;
    }
}
