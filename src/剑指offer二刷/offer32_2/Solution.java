package 剑指offer二刷.offer32_2;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/20 13:24
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null){
            queue.offer(root);
        }
        List<List<Integer>> list = new ArrayList<>();
        while (!queue.isEmpty()){
            List<Integer> list1 = new ArrayList<>();
            for (int i = queue.size(); i > 0; --i){
                TreeNode poll = queue.poll();
                if (poll.left != null){
                    queue.offer(poll.left);
                }
                if (poll.right != null){
                    queue.offer(poll.right);
                }
                list1.add(poll.val);
            }
            list.add(list1);
        }
        return list;
    }
}
