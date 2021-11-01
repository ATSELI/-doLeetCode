package 剑指offer.offer26;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/25 15:28
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 * 例如:
 * 给定的树 A:
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 B:
 *    4
 *   /
 *  1
 * 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。
 *
 * 例1
 * 输入：A = [1,2,3], B = [3,1]
 * 输出：false
 */
public class Solution {
    // 我的,答案还是错的
    // public boolean isSubStructure(TreeNode A, TreeNode B) {
    //     if (B == null){
    //         return false;
    //     }
    //     TreeNode BHead = B;
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     if (A == null){
    //         return false;
    //     }else {
    //         queue.add(A);
    //     }
    //     while (!queue.isEmpty()){
    //         TreeNode node = queue.poll();
    //         if (node.val == B.val){
    //             boolean compare = compare(node, B);
    //             if (compare){
    //                 return true;
    //             }else {
    //                 B = BHead;
    //             }
    //         }
    //         if (node.left != null){
    //             queue.add(node.left);
    //         }
    //         if (node.right != null){
    //             queue.add(node.right);
    //         }
    //     }
    //     return false;
    // }
    // public boolean compare(TreeNode A, TreeNode B){
    //     if (A == null && B == null){
    //         return true;
    //     }
    //     if (A== null || B == null){
    //         return false;
    //     }
    //     if (A.val != B.val){
    //         return false;
    //     }
    //     return compare(A.left, B.left) || compare(A.right, B.right);
    // }


    // k神
    // || 有一个是true便返回true, && 有一个是false便返回false
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B)  || isSubStructure(A.right, B));
    }
    boolean recur(TreeNode A, TreeNode B){
        if (B == null){
            return true;
        }
        if ((A == null || A.val != B.val)){
            return false;
        }
        return recur(A.left, B.left) && recur(A.right, B.right);
    }

}



