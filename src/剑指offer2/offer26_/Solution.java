package 剑指offer2.offer26_;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/15 12:44
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/LGjMqU
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 数组加双指针
    public void reorderList(ListNode head) {
        if (head == null || head.next == null){
            return;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode listNode = head;
        while (listNode != null){
            list.add(listNode);
            listNode = listNode.next;
        }
        int length = list.size();
        int start = 0;
        int end = length - 1;
        while (start < end){
            list.get(end).next = list.get(start).next;
            list.get(start).next = list.get(end);
            start++;
            end--;
        }
        list.get(start).next = null;
    }

    //快慢指针
    // private ListNode reverseList(ListNode head) {
    //     ListNode pre = null;
    //     ListNode cur = head;
    //     while (cur != null) {
    //         ListNode tmp = cur.next;
    //         cur.next = pre;
    //         pre = cur;
    //         cur = tmp;
    //     }
    //     return pre;
    // }
    //
    // public void reorderList(ListNode head) {
    //     ListNode pre = new ListNode();
    //     ListNode slow = pre;
    //     ListNode fast = pre;
    //     pre.next = head;
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     ListNode half = slow.next;
    //     slow.next = null;
    //     ListNode rev_half = this.reverseList(half);
    //     ListNode cur = pre.next;
    //     while (rev_half != null) {
    //         ListNode tmp = cur.next;
    //         cur.next = rev_half;
    //         cur = cur.next;
    //         rev_half = rev_half.next;
    //         cur.next = tmp;
    //         cur = cur.next;
    //     }
    // }
    //
    // 作者：qingfengpython
    // 链接：https://leetcode-cn.com/problems/LGjMqU/solution/shua-chuan-jian-zhi-offer-day13-lian-bia-chs7/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
