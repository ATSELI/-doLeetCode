package 剑指offer2.offer53;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/25 23:43
 * 给定一棵二叉搜索树和其中的一个节点 p ，找到该节点在树中的中序后继。如果节点没有中序后继，请返回 null 。
 * 节点p的后继是值比p.val大的节点中键值最小的节点，即按中序遍历的顺序节点 p 的下一个节点。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/P5rCT8
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // ans : 记录当前比 p 节点大的节点
        TreeNode ans = null;
        // 在二叉搜索树中进行搜索
        while(root != null){
            // 如果当前节点 > p，则更新当前比 p 节点大的节点 ans , 同时去左子树进行搜索
            if(root.val > p.val){
                ans = root;
                root = root.left;
            }else{// 如果当前节点 < p , 则到右子树进行搜索
                root = root.right;
            }
        }
        // 当搜寻结束后，ans 保存的就是最近的比 p 节点大的节点。
        return ans;
    }

    // 作者：logilong
    // 链接：https://leetcode-cn.com/problems/P5rCT8/solution/offerii053er-cha-sou-suo-shu-zhong-de-zh-icb0/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。






    // Queue<TreeNode> queue = new LinkedList<>();
    // public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    //     preNode(root);
    //     while (!queue.isEmpty()){
    //         TreeNode node = queue.poll();
    //         if (node == p){
    //             if (!queue.isEmpty()){
    //                 return queue.poll();
    //             }else {
    //                 return null;
    //             }
    //         }
    //     }
    //     return null;
    // }
    //
    // public void preNode(TreeNode node){
    //     if (node.left != null){
    //         preNode(node.left);
    //     }
    //     queue.offer(node);
    //     if (node.right != null){
    //         preNode(node.right);
    //     }
    // }
}
