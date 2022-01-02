package oneQuestionPerDay.No700;

import common.TreeNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/11/26 9:15
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || val == root.val){
            return root;
        }
        if (val < root.val){
            return searchBST(root.left, val);
        }else {
            return searchBST(root.right, val);
        }
    }
}
