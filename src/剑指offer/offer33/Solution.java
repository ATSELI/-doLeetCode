package 剑指offer.offer33;


public class Solution {
    /** 
    * @name verifyPostorder
    * @param [postorder] 
    * @return boolean
    * @date 2021/7/15:14:41
    * @author ATSELI
    * @description 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果
     * 。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
     *      5
     *     / \
     *    2   6
     *   / \
     *  1   3
    */
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) {
            return true;
        }
        int p  = i;
        while(postorder[p] < postorder[j]) {
            p++;
        }
        int m = p;
        while(postorder[p] > postorder[j]) {
            p++;
        }
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }

}
