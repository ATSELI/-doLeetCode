package 剑指offer2.offer52;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/25 23:13
 * 给你一棵二叉搜索树，请按中序遍历 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/NYBBNL
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    Queue<TreeNode> queue = new LinkedList<>();
    public TreeNode increasingBST(TreeNode root) {
        if (root == null){
            return null;
        }
        BTS(root);
        TreeNode poll = queue.poll();
        TreeNode head = poll;
        while (!queue.isEmpty()){
            TreeNode p = queue.poll();
            p.left = null;
            p.right = null;
            poll.right = p;
            poll = p;
        }
        return head;
    }

    public void BTS(TreeNode node){
        if (node.left != null){
            BTS(node.left);
        }
        queue.offer(node);
        if (node.right != null){
            BTS(node.right);
        }
    }
}
