package 剑指offer.offer18;

import common.ListNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/4 10:36
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 * 注意：此题对比原题有改动
 * 示例 1:
 * <p>
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为5的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 示例 2:
 * <p>
 * 输入: head = [4,5,1,9], val = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为1的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode res = head, pre = head.next;
        if (head.val == val) {
            return head.next;
        }
        while (pre != null) {
            if (pre.val == val) {
                head.next = pre.next;
                return res;
            }
            head = pre;
            pre = pre.next;
        }
        return res;
    }

    // 大佬做法
    // public ListNode deleteNode(ListNode head, int val) {
    //     if(head.val == val) return head.next;
    //     ListNode pre = head, cur = head.next;
    //     while(cur != null && cur.val != val) {
    //         pre = cur;
    //         cur = cur.next;
    //     }
    //     if(cur != null) pre.next = cur.next;
    //     return head;
    // }
    //
    // 作者：jyd
    // 链接：https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/solution/mian-shi-ti-18-shan-chu-lian-biao-de-jie-dian-sh-2/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
