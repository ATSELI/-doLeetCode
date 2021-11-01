package 剑指offer2.offer27_NotIntact;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/15 19:15
 * 给定一个链表的 头节点head，请判断其是否为回文链表。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/aMhZSa
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 辅助数组
    public boolean isPalindrome(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode pre = head;
        while (pre != null){
            list.add(pre);
            pre = pre.next;
        }
        int start = 0;
        int end = list.size() - 1;
        while (start < end){
            if (list.get(start).val != list.get(end).val){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 方法二,找中点,翻转后半段
    //......
}
