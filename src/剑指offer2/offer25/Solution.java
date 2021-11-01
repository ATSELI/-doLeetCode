package 剑指offer2.offer25;

import common.ListNode;

import java.util.Stack;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/14 22:31
 * 给定两个非空链表 l1和 l2来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 * 可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lMSNwu
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        // int i = 3999999999;
        // ListNode listNode = new ListNode(2);
        // listNode.next = new ListNode(3);
        // listNode.next.next = new ListNode(4);
        // int a = 0;
        // while (listNode!= null){
        //     System.out.println("a:" + a + ",val:" + listNode.val);
        //     a = a * 10 + listNode.val;
        //     listNode = listNode.next;
        //     System.out.println(a);
        // }
        // System.out.println(a);
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(9);
        listNode1.next = new ListNode(9);
        Solution solution = new Solution();
        solution.addTwoNumbers(listNode, listNode1);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.add(l2.val);
            l2 = l2.next;
        }
        int count = 0, a, b, sum;
        ListNode listNode = new ListNode(0);
        while (!(stack1.isEmpty() && stack2.isEmpty())) {
            System.out.println(count);
            a = stack1.isEmpty() ? 0 : stack1.pop();
            b = stack2.isEmpty() ? 0 : stack2.pop();
            sum = a + b + count >= 10 ? (a + b + count) % 10: a + b + count;
            System.out.println("sum:" + sum);
            count = (a + b + count) / 10;
            System.out.println("count: " + count);
            listNode.val = sum;
            ListNode listNode1 = new ListNode(0);
            listNode1.next = listNode;
            listNode = listNode1;
        }
        if (count > 0) {
            listNode.val = count;
        }

        return listNode.val == 0? listNode.next: listNode;
    }
}










