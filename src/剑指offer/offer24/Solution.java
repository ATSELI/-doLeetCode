package 剑指offer.offer24;

import common.ListNode;

import java.util.List;
import java.util.Stack;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/9 14:54
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class Solution {
    // 我的解法: 辅助栈
    // public ListNode reverseList(ListNode head) {
    //     if (head == null){
    //         return null;
    //     }
    //     Stack<Integer> stack = new Stack<>();5
    //     while (head != null){
    //         stack.push(head.val);
    //         head = head.next;
    //     }
    //     ListNode listNode = new ListNode(stack.pop());
    //     ListNode result = listNode;
    //     while (!stack.isEmpty()){
    //         listNode.next = new ListNode(stack.pop());
    //         listNode = listNode.next;
    //     }
    //     return result;
    // }

    //大佬解法,迭代,双指针
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

}
