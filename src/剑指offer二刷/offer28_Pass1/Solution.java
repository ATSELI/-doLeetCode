package 剑指offer二刷.offer28_Pass1;

import common.TreeNode;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/21 22:33
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isTrue(root.left, root.right);
    }

    public boolean isTrue(TreeNode A, TreeNode B){
        if (A == null && B == null){
            return true;
        }
        if (A == null || B == null ||A.val != B.val){
            return false;
        }
        return isTrue(A.left, B.right) && isTrue(A.right, B.left);
    }
}
