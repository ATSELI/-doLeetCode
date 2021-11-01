package 剑指offer2.offer47_;

import common.TreeNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/23 21:05
 * 给定一个二叉树 根节点root，树的每个节点的值要么是 0，要么是 1。请剪除该二叉树中所有节点的值为 0 的子树。
 * 节点 node 的子树为node 本身，以及所有 node的后代。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pOCWxh
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public TreeNode pruneTree(TreeNode root) {
        boolean b = allZero(root);
        if (b){
            return null;
        }
        return root;
    }

    public boolean allZero(TreeNode node){
        if (node == null){
            return true;
        }
        boolean left = allZero(node.left);
        boolean right = allZero(node.right);
        if (left){
            node.left = null;
        }
        if (right){
            node.right = null;
        }
        return node.val == 0 && left && right;
    }
}
