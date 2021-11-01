package 剑指offer.offer32_3;

import common.TreeNode;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/22 20:54
 * 请实现一个函数按照之字形顺序打印二叉树，
 * 即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *      3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *    [
 *   [3],
 *   [20,9],
 *   [15,7]
 *   ]
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // // 我的, 与方法二大概一致
        // Deque<TreeNode> deque = new LinkedList<>();
        // List<List<Integer>> res = new ArrayList<>();
        // if(root != null) {
        //     deque.add(root);
        // }
        // while(!deque.isEmpty()) {
        //     // 打印奇数层
        //     List<Integer> tmp = new ArrayList<>();
        //     for(int i = deque.size(); i > 0; i--) {
        //         // 从左向右打印
        //         TreeNode node = deque.removeFirst();
        //         tmp.add(node.val);
        //         // 先左后右加入下层节点
        //         if(node.left != null) {
        //             deque.addLast(node.left);
        //         }
        //         if(node.right != null) {
        //             deque.addLast(node.right);
        //         }
        //     }
        //     res.add(tmp);
        //     if(deque.isEmpty()) {
        //         break; // 若为空则提前跳出
        //     }
        //     // 打印偶数层
        //     tmp = new ArrayList<>();
        //     for(int i = deque.size(); i > 0; i--) {
        //         // 从右向左打印
        //         TreeNode node = deque.removeLast();
        //         tmp.add(node.val);
        //         // 先右后左加入下层节点
        //         if(node.right != null) {
        //             deque.addFirst(node.right);
        //         }
        //         if(node.left != null) {
        //             deque.addFirst(node.left);
        //         }
        //     }
        //     res.add(tmp);
        // }
        // return res;


        // 层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            LinkedList<Integer> mid = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--){
                TreeNode poll = queue.poll();
                if (list.size() % 2 == 0){
                    mid.addLast(poll.val);
                }else {
                    mid.addFirst(poll.val);
                }
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
