package 剑指offer.offer32_2;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/19 10:53
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> mid = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--){
                TreeNode poll = queue.poll();
                mid.add(poll.val);
                if (poll.left != null){
                    queue.add(poll.left);
                }
                if (poll.right != null){
                    queue.add(poll.right);
                }
            }
            list.add(mid);
        }
        return list;
    }
}
