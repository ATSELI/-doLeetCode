package 剑指offer二刷.offer68_1;

import common.TreeNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/11/2 16:05
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val <= p.val && root.val <= q.val){
            if (root.val == p.val || root.val == q.val){
                return root;
            }
            return lowestCommonAncestor(root.right, p, q);
        }
        if (root.val >= p.val && root.val >= q.val){
            if (root.val == p.val || root.val == q.val){
                return root;
            }
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}
