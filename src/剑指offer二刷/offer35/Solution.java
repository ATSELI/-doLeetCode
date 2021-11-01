package 剑指offer二刷.offer35;

import common.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/16 11:03
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // public Node copyRandomList(Node head) {
    //     if (head == null){
    //         return null;
    //     }
    //     List<Node> list = new LinkedList<>();
    //     List<Node> list2 = new LinkedList<>();
    //     Node record = head;
    //     while (record != null){
    //         list.add(record);
    //         list2.add(new Node(record.val));
    //         record = record.next;
    //     }
    //     for (int i = 0; i < list2.size() - 1; i++) {
    //         list2.get(i).next = list2.get(i + 1);
    //     }
    //     for (int i = 0; i < list2.size(); i++) {
    //         Node node = list2.get(i);
    //         if (list.get(i).random == null){
    //             list2.get(i).random = null;
    //         }else {
    //             node.random = list2.get(list.indexOf(list.get(i).random));
    //         }
    //
    //     }
    //     return list2.get(0);
    // }

    // 哈希表
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node record = head;
        while (record != null){
            map.put(record, new Node(record.val));
            record = record.next;
        }
        record = head;
        while (record != null){
            map.get(record).next = map.get(record.next);
            map.get(record).random = map.get(record.random);
            record = record.next;
        }
        return map.get(head);
    }
}
