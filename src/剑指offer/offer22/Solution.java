package 剑指offer.offer22;

import common.ListNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/4 15:00
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 *
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * 返回链表 4->5.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int num = 0;
        ListNode cur = head;
        while (head != null){
            head = head.next;
            num++;
        }
        head = cur;
        for (int i = 0; i < num - k; i ++){
            head = head.next;
        }
        return head;
    }
}
