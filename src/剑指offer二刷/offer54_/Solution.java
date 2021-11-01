package 剑指offer二刷.offer54_;

import common.TreeNode;

import java.util.LinkedList;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/29 1:37
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 */
public class Solution {
    LinkedList<Integer> list = new LinkedList<>();
    public int kthLargest(TreeNode root, int k) {
        recur(root);
        return list.get(list.size() - k);
    }

    public void recur(TreeNode root){
        if (root == null){
            return;
        }
        recur(root.left);
        list.add(root.val);
        recur(root.right);
    }
}
