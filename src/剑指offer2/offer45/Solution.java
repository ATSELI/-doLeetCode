package 剑指offer2.offer45;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/23 18:45
 * 给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
 * 假设二叉树中至少有一个节点。
 *  
 * 示例 1:
 * 输入: root = [2,1,3]
 * 输出: 1
 * 示例 2:
 * 输入: [1,2,3,4,null,5,6,null,null,7]
 * 输出: 7
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/LwUNpT
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root.left == null && root.right == null){
            return root.val;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = root.val;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i< size; ++i){
                TreeNode poll = queue.poll();
                if (i == 0){
                    ans = poll.val;
                }
                if (poll.left != null){
                    queue.offer(poll.left);
                }
                if (poll.right != null){
                    queue.offer(poll.right);
                }
            }
        }
        return ans;
    }
}
