package 剑指offer.offer55;


import common.TreeNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/7/15 10:21
 */
public class Solution {
/*
输入一棵二叉树的根节点，求该树的深度。
从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，
最长路径的长度为树的深度
*/
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
