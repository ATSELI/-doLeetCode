package 剑指offer2.offer43_;

import common.TreeNode;

import java.util.*;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/22 15:28
 * 完全二叉树是每一层（除最后一层外）都是完全填充（即，节点数达到最大，第 n 层有 2n-1 个节点）的，并且所有的节点都尽可能地集中在左侧。
 * 设计一个用完全二叉树初始化的数据结构CBTInserter，它支持以下几种操作：
 * CBTInserter(TreeNode root)使用根节点为root的给定树初始化该数据结构；
 * CBTInserter.insert(int v) 向树中插入一个新节点，节点类型为 TreeNode，值为 v 。使树保持完全二叉树的状态，并返回插入的新节点的父节点的值；
 * CBTInserter.get_root() 将返回树的根节点。
 * 示例 1：
 * 输入：inputs = ["CBTInserter","insert","get_root"], inputs = [[[1]],[2],[]]
 * 输出：[null,1,[1,2]]
 * 示例 2：
 * 输入：inputs = ["CBTInserter","insert","insert","get_root"], inputs = [[[1,2,3,4,5,6]],[7],[8],[]]
 * 输出：[null,3,4,[1,2,3,4,5,6,7,8]]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/NaqhDT
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CBTInserter {
    private Queue<TreeNode> queue = new LinkedList<>();
    private TreeNode root;

    public CBTInserter(TreeNode root) {
        this.root = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode poll = q.poll();
            if (poll.left == null || poll.right == null){
                queue.offer(poll);
            }
            if (poll.left != null){
                q.offer(poll.left);
            }
            if (poll.right != null){
                q.offer(poll.right);
            }
        }
    }

    public int insert(int v) {
        TreeNode peek = queue.peek();
        if (peek.left == null){
            peek.left = new TreeNode(v);
            queue.offer(peek.left);
        }else {
            peek.right = new TreeNode(v);
            queue.offer(peek.right);
            queue.poll();
        }
        return peek.val;
    }

    public TreeNode get_root() {
        return this.root;
    }

    // 作者：Hanxin_Hanxin
    // 链接：https://leetcode-cn.com/problems/NaqhDT/solution/cpython3java-dui-lie-cun-chu-bu-man-jie-ekfyh/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
