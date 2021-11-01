package 剑指offer2.offer54;

import common.TreeNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/26 16:07
 * 给定一个二叉搜索树，请将它的每个节点的值替换成树中大于或者等于该节点值的所有节点值之和。
 *
 *  
 *
 * 提醒一下，二叉搜索树满足下列约束条件：
 *
 * 节点的左子树仅包含键 小于 节点键的节点。
 * 节点的右子树仅包含键 大于 节点键的节点。
 * 左右子树也必须是二叉搜索树。
 * 示例 1：
 * 输入：root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
 * 输出：[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
 * 示例 2：
 * 输入：root = [0,null,1]
 * 输出：[1,null,1]
 * 示例 3：
 * 输入：root = [1,0,2]
 * 输出：[3,3,2]
 * 示例 4：
 * 输入：root = [3,2,4,1]
 * 输出：[7,9,4,10]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/w6cpku
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // 递归
    // int biggerValue = 0;
    // public TreeNode convertBST(TreeNode root) {
        // if (root == null){
        //     return root;
        // }
        // if (root.right != null){
        //     convertBST(root.right);
        // }
        // root.val += biggerValue;
        // biggerValue = root.val;
        // if (root.left != null){
        //     convertBST(root.left);
        // }

        // 大佬写法
        // if (root != null) {
        //     convertBST(root.right);
        //     root.val += biggerValue;
        //     biggerValue = root.val;
        //     convertBST(root.left);
        // }

        // 作者：lcbin
        // 链接：https://leetcode-cn.com/problems/w6cpku/solution/python3-java-c-golang-si-chong-bian-chen-vvlf/
        // 来源：力扣（LeetCode）
        // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
        // return root;

    // Morris 反序中序遍历,没看懂
    public TreeNode convertBST(TreeNode root) {
        int s = 0;
        TreeNode head = root;
        while (root != null){
            if (root.right == null){
                s += root.val;
                root.val = s;
                root = root.left;
            }else {
                TreeNode next = root.right;
                while (next.left != null && next.left != root){
                    next = next.left;
                }
                if (next.left == null){
                    next.left = root;
                    root = root.right;
                }else {
                    s += root.val;
                    root.val = s;
                    next.left = null;
                    root = root.left;
                }
            }
        }
        return head;
    }
}
