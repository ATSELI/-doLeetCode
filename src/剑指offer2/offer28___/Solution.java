package 剑指offer2.offer28___;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/15 19:29
 * 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
 * <p>
 * 给定位于列表第一级的头节点，请扁平化列表，即将这样的多级双向链表展平成普通的双向链表，使所有结点出现在单级双链表中。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/Qv1Da2
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}


public class Solution {
    public Node flatten(Node head) {
        Deque<Node> deque = new ArrayDeque<>();
        Node rec = head;
        while (head != null) {
            if (head.child != null) {
                if (head.next != null) {
                    deque.push(head.next);
                }
                Node node = head.child;
                head.next = head.child;
                head.next.prev = head;
                head.child = null;
                head = node;
            } else {
                if (head.next != null){
                    head = head.next;
                }else {
                    Node l = head;
                    if (!deque.isEmpty()){
                        head = deque.pop();
                    }else {
                        break;
                    }
                    l.next = head;
                    head.prev = l;
                }
            }
        }
        return rec;
    }
}
