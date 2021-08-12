package 剑指offer.offer35;

import common.Node;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/9 17:36
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，
 * 每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public static void main(String[] args) {
    //     List<Integer> a = new ArrayList<>();
    //     a.add(1);
    //     a.add(2);
    //     a.add(6);
    //     a.add(18);
    //     a.remove(1);
    //     a.add(1,3);
    //     for (int i = 0; i < a.size(); i++) {
    //         System.out.println(a.get(i));
    //     }
    // }
    public Node copyRandomList(Node head) {
        // 做不出,大佬解法
        // 1.hash
        // if (head == null){
        //     return null;
        // }
        // Node cur = head;
        // Map<Node, Node> map = new HashMap<>();
        // while (cur != null){
        //     map.put(cur, new Node(cur.val));
        //     cur = cur.next;
        // }
        // cur = head;
        // while (cur != null){
        //     map.get(cur).next = map.get(cur.next);
        //     map.get(cur).random = map.get(cur.random);
        //     cur = cur.next;
        // }
        // return map.get(head);

        // 2. 拼接
        if (head == null){
            return null;
        }
        Node cur = head, pre;
        while (cur != null) {
            pre = cur.next;
            cur.next = new Node(cur.val);
            cur.next.next = pre;
            cur = pre;
        }
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        cur = head.next;
        pre = head;
        Node res = head.next;
        while (cur.next != null) {
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;
        return res;
    }

    // 作者：jyd
    // 链接：https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/solution/jian-zhi-offer-35-fu-za-lian-biao-de-fu-zhi-ha-xi-/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
