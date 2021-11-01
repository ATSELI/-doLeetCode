package 剑指offer.offer52;

import common.ListNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/4 18:20
 * 输入两个链表，找出它们的第一个公共节点。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     LinkedList<ListNode> list = new LinkedList<>();
    //     while (headA != null){
    //         list.add(headA);
    //         headA = headA.next;
    //     }
    //     while (headB != null){
    //         if (list.contains(headB)){
    //             return headB;
    //         }
    //         headB = headB.next;
    //     }
    //     return null;
    // }

    // k神,双指针
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        // 即两个指针都走完了a+b+公共的长度,如果有公共节点,则一定会相等,否则两个会同时走到null
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }
    //
    // 作者：jyd
    // 链接：https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/solution/jian-zhi-offer-52-liang-ge-lian-biao-de-gcruu/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
