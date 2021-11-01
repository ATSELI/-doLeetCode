package 剑指offer二刷.offer06;

import common.ListNode;

import java.util.Stack;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/16 10:45
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class Solution {
    // 链表倒转
    // public int[] reversePrint(ListNode head) {
    //     int len = 0;
    //     ListNode pre = null, cur = head;
    //     while (cur != null){
    //         ListNode next = cur.next;
    //         cur.next = pre;
    //         pre = cur;
    //         cur = next;
    //         len ++;
    //     }
    //     int[] ans = new int[len];
    //     for (int i = 0; i < len; i++) {
    //         ans[i] = pre.val;
    //         pre = pre.next;
    //     }
    //     return ans;
    // }

    // 压栈
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null){
            stack.push(head.val);
            head = head.next;
        }
        int[] ans = new int[stack.size()];
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
