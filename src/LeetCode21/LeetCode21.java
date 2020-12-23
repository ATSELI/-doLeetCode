package LeetCode21;


/**
 * @author ATSELI
 * @version 1.0
 * @date 2020/12/23 19:40
 */
public class LeetCode21 {
    ListNode head = new ListNode();

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        head = l3;
        while (l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {
                l3.next = l1;
                l3 = l1;
                l1 = l1.next;
            }else {
                l3.next = l2;
                l3 = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null)
        {
            l3.next = l1;
        }
        if (l2 != null)
        {
            l3.next = l2;
        }
        return head.next;
    }


}
