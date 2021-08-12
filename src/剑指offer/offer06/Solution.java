package 剑指offer.offer06;

import common.ListNode;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/8 14:26
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     * }
     */

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        listNode.next = new ListNode(6);
        listNode = listNode.next;
        listNode.next = new ListNode(3);
        Solution solution = new Solution();
        int[] ints = solution.reversePrint(head);
        // for (int a: ints){
        //     System.out.println(a);
        // }
    }
    // public int[] reversePrint(ListNode head) {
    //     int sum = 0;
    //     ListNode listNode = head;
    //     while (head != null) {
    //         head = head.next;
    //         sum++;
    //     }
    //     // System.out.println(sum);
    //     List<Integer> list = new LinkedList<>();
    //     while (listNode != null) {
    //         list.add(listNode.val);
    //         listNode = listNode.next;
    //     }
    //     Collections.reverse(list);
    //     return list.stream().mapToInt(Integer::intValue).toArray();
    // }

    // 大佬解法
    // 辅助栈法
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null){
            System.out.println("head.val:" + head.val);
            stack.push(head.val);
            head = head.next;
        }
        // while (!stack.isEmpty()){
        //     System.out.println(stack.pop());
        // }
        // System.out.println("size:" + stack.size());
        int[] result = new int[stack.size()];
        int size = stack.size();
        // stack.size()会动态变化
        // for (int i = 0; i < stack.size(); i++){
        for (int i = 0; i < size; i++){
            Integer pop = stack.pop();
            System.out.println("pop:" + pop);
            result[i] = pop;
        }
        return result;
    }
}
