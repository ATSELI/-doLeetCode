package 剑指offer二刷.offer26_Pass1;

import common.TreeNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/21 16:57
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 * 例如:
 * 给定的树 A:
 *
 *     3
 *    / \
 *   4  5
 *  / \
 * 1  2
 * 给定的树 B：
 *
 *   4
 *  /
 * 1
 * 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。

 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (isSubStructure(A.left, B) || isSubStructure(A.right, B) || isSubTree(A, B));

    }

    public boolean isSubTree(TreeNode A, TreeNode B){
        if (B == null){
            return true;
        }
        if (A == null || A.val != B.val){
            return false;
        }
        return isSubTree(A.left, B.left) && isSubTree(A.right, B.right);
    }

}
