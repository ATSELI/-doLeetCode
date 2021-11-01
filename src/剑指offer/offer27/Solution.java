package 剑指offer.offer27;

import common.TreeNode;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/23 13:17
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * 输出
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 */
public class Solution {

    // public TreeNode mirrorTree(TreeNode root) {
    //     if (root == null) {
    //         return null;
    //     }
    //     return exchange(root);
    // }
    //
    // public TreeNode exchange(TreeNode node) {
    //     if (node == null) {
    //         return null;
    //     }
    //     if (node.left != null || node.right != null) {
    //         TreeNode tmp = node.left;
    //         // 此时node.left已经发生了改变,故用tep先保存node,left节点
    //         node.left = exchange(node.right);
    //         node.right = exchange(tmp);
    //     }
    //     return node;
    // }
// }
    // 简版
    // public TreeNode mirrorTree(TreeNode root) {
    //     if (root == null){
    //         return null;
    //     }
    //     TreeNode tmp = root.left;
    //     root.left = mirrorTree(root.right);
    //     root.right = mirrorTree(root.left);
    //     return root;
    // }
    //}
    //方法二,辅助栈
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            if (pop.left != null){
                stack.add(pop.left);
            }
            if (pop.right != null){
                stack.add(pop.right);
            }
            TreeNode tmp = pop.left;
            pop.left = pop.right;
            pop.right = tmp;
        }
        return root;
    }
}
