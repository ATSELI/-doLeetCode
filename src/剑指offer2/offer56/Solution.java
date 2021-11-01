package 剑指offer2.offer56;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/27 17:38
 * 给定一个二叉搜索树的 根节点 root和一个整数 k , 请判断该二叉搜索树中是否存在两个节点它们的值之和等于 k 。假设二叉搜索树中节点的值均唯一。*
 * 示例 1：
 * 输入: root = [8,6,10,5,7,9,11], k = 12
 * 输出: true
 * 解释: 节点 5 和节点 7 之和等于 12
 * 示例 2：
 * 输入: root = [8,6,10,5,7,9,11], k = 22
 * 输出: false
 * 解释: 不存在两个节点值之和为 22 的节点
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/opLdQZ
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root != null){
            if (list.contains(k - root.val)){
                return true;
            }
            list.add(root.val);
            return findTarget(root.left, k) || findTarget(root.right, k);
        }
        return false;
    }

    //双指针
}
