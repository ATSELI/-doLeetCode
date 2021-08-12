package 剑指offer.offer25;

import common.ListNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/7/15 10:45
 */
public class Solution {

/*
* 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
* 输入：1->2->4, 1->3->4
* 输出：1->1->2->3->4->4
* */

    /**
    * @name increaseList
    * @param [l1, l2]
    * @return common.ListNode
    * @date 2021/7/15:14:42
    * @author ATSELI
    * @description
    */
    public ListNode increaseList(ListNode l1, ListNode l2){
        if (l1 == null || l2 == null){
            return l1 == null ? l2: l1;
        }

        if (l1.val <= l2.val){
            l1.next = increaseList(l1.next, l2);
            return l1;
        }else {
            l2.next = increaseList(l1, l2.next);
            return l2;
        }
    }

}
