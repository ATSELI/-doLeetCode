package 剑指offer2.offer46;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/23 20:31
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 * 示例 1:
 * 输入:[1,2,3,null,5,null,4]
 * 输出:[1,3,4]
 * 示例 2:
 * 输入:[1,null,3]
 * 输出:[1,3]
 * 示例 3:
 * 输入:[]
 * 输出:[]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/WNC0Lk
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        Solution solution = new Solution();
        solution.rightSideView(root);
    }
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            for (int i = queue.size(); i > 0; --i){
                TreeNode treeNode = queue.poll();
                if (i == 1){
                    System.out.println(treeNode.val);
                    ans.add(treeNode.val);
                }
                if (treeNode.left != null){
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null){
                    queue.offer(treeNode.right);
                }
            }
        }
        return ans;
    }
}
