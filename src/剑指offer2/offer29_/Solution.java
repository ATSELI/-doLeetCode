package 剑指offer2.offer29_;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/15 21:15
 * 给定循环升序列表中的一个点，写一个函数向这个列表中插入一个新元素insertVal ，使这个列表仍然是循环升序的。
 * 给定的可以是这个列表中任意一个顶点的指针，并不一定是这个列表中最小元素的指针。
 * 如果有多个满足条件的插入位置，可以选择任意一个位置插入新的值，插入后整个列表仍然保持有序。
 * 如果列表为空（给定的节点是 null），需要创建一个循环有序列表并返回这个节点。否则。请返回原先给定的节点。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/4ueAj6
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public static void main(String[] args) {
        Node node = new Node(1);
        Solution solution = new Solution();
        Node insert = solution.insert(node, 0);
        System.out.println(insert.val);
        System.out.println(insert.next.val);
    }
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node newHead = new Node(insertVal);
            newHead.next = newHead;
            return newHead;
        }
        Node max = null;
        Node cur = head;
        do {
            if (insertVal >= cur.val && insertVal <= cur.next.val) {
                Node temp = new Node(insertVal, cur.next);
                cur.next = temp;
                return head;
            }
            if (cur.val > cur.next.val) {
                max = cur;
            }
            cur = cur.next;
        } while (cur != head);
        // 无论insertVal是最大的数还是最小的数,都可以接在最后然后与head形成闭环
        max = max == null ? cur : max;
        Node temp = new Node(insertVal, max.next);
        max.next = temp;
        return head;
    }

}


class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
}
