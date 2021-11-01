package 剑指offer2.offer50_;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/9/25 13:26
 * 给定一个二叉树的根节点 root，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * 示例 1：
 * 输入：root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
 * 输出：3
 * 解释：和等于 8 的路径有 3 条，如图所示。
 * 示例 2：
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * 输出：3
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/6eUYwP
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {
        // 如果和=targetSum则可以直接加上去
        map.put(0, 1);
        return dfs(root, 0, targetSum);
    }

    public int dfs(TreeNode treeNode, int sum, int targetSum){
        if (treeNode == null){
            return 0;
        }
        int res = 0;
        sum += treeNode.val;
        res += map.getOrDefault(sum - targetSum, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        res += dfs(treeNode.left, sum, targetSum);
        res += dfs(treeNode.right, sum, targetSum);
        map.put(sum, map.get(sum) - 1);
        return res;
    }


    // 作者：i2omantic-robinson
    // 链接：https://leetcode-cn.com/problems/6eUYwP/solution/javaqian-zhui-he-ha-xi-gao-xiao-lu-miao-o55ou/
    // 来源：力扣（LeetCode）
    // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
