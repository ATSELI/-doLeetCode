package 剑指offer二刷.offer36;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/29 1:35
 */
public class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
