package 剑指offer2.offer44;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/23 9:20
 * 给定一棵二叉树的根节点root ，请找出该二叉树中每一层的最大值。
 * 示例1：
 * 输入: root = [1,3,2,5,3,null,9]
 * 输出: [1,3,9]
 * 解释:
 * 1
 * / \
 * 3   2
 * / \   \
 * 5   3   9
 * 示例2：
 * 输入: root = [1,2,3]
 * 输出: [1,3]
 * 解释:
 * 1
 * / \
 * 2   3
 * 示例3：
 * 输入: root = [1]
 * 输出: [1]
 * 示例4：
 * 输入: root = [1,null,2]
 * 输出: [1,2]
 * 解释:
 * 1
 * \
 * 2
 * 示例5
 * 输入: root = []
 * 输出: []
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/hPov7L
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max;
        List<Integer> maxs = new ArrayList<>();
        maxs.add(root.val);
        while (!queue.isEmpty()){
            max = Integer.MIN_VALUE;
            for (int i = queue.size(); i > 0; --i){
                TreeNode poll = queue.poll();
                if (poll.left != null){
                    queue.offer(poll.left);
                    max = Math.max(max, poll.left.val);
                }
                if (poll.right != null){
                    queue.offer(poll.right);
                    max = Math.max(max, poll.right.val);
                }
            }
            maxs.add(max);
        }
        maxs.remove(maxs.size() - 1);
        return maxs;
    }
}
