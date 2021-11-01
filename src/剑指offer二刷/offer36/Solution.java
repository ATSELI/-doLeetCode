package 剑指offer二刷.offer36;

import common.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/29 1:21
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。
 *
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/
 */
public class Solution {
    LinkedList<Node> list = new LinkedList<>();
    public Node treeToDoublyList(Node root) {
        if (root == null){
            return null;
        }
        addList(root);
        for (int i = 0; i < list.size() - 1; ++i) {
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);
        }
        list.getFirst().left = list.getLast();
        list.getLast().right = list.getFirst();
        return list.getFirst();
    }

    public void addList(Node root){
        if (root.left != null){
            addList(root.left);
        }
        list.add(root);
        if (root.right != null){
            addList(root.right);
        }
    }


    // k神做法
    Node pre, head;
    public Node treeToDoublyList2(Node root) {
        if(root == null) {
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    void dfs(Node cur) {
        if(cur == null) {
            return;
        }
        dfs(cur.left);
        if(pre != null) {
            pre.right = cur;
        } else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }

}
