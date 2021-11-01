package 剑指offer二刷.offer27;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/21 21:08
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null){
            queue.offer(root);
        }
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            if (poll.left != null){
                queue.offer(poll.left);
            }
            if (poll.right != null){
                queue.offer(poll.right);
            }
            TreeNode temp = poll.left;
            poll.left = poll.right;
            poll.right = temp;
        }
        return root;
    }
}
