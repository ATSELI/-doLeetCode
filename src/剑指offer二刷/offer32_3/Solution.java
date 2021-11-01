package 剑指offer二刷.offer32_3;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/20 13:42
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第
 * 二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null){
            queue.offer(root);
        }
        List<List<Integer>> list = new ArrayList<>();
        boolean sign = true;
        while (!queue.isEmpty()){
            LinkedList<Integer> list1 = new LinkedList<>();
            for (int i = queue.size(); i > 0; --i) {
                TreeNode poll = queue.poll();
                if (poll.left != null){
                    queue.offer(poll.left);
                }
                if (poll.right != null){
                    queue.offer(poll.right);
                }
                if (sign){
                    list1.addLast(poll.val);
                }else {
                    list1.addFirst(poll.val);
                }
            }
            sign = !sign;
            list.add(list1);
        }

        return list;
    }
}
