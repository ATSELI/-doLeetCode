package 剑指offer二刷.offer07_UnKnow;

import common.TreeNode;

import java.util.HashMap;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/11/3 13:50
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 *
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 * https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 */
public class Solution {
    int[] preorder;
    HashMap<Integer, Integer> dic = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }
    TreeNode recur(int root, int left, int right) {
        // 递归终止
        if(left > right) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[root]);
        // 划分根节点、左子树、右子树
        int i = dic.get(preorder[root]);
        // 开启左子树递归
        node.left = recur(root + 1, left, i - 1);
        // 开启右子树递归
        node.right = recur(root + i - left + 1, i + 1, right);
        // 回溯返回根节点
        return node;
    }
}
