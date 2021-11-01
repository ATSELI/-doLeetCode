package 剑指offer.offer32_1;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/22 19:30
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * 输入
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 返回
 * [3,9,20,15,7]
 */
public class Solution {
    public int[] levelOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            for (int i = queue.size(); i > 0; i--){
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left != null){
                    queue.add(poll.left);
                }
                if (poll.right != null){
                    queue.add(poll.right);
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
