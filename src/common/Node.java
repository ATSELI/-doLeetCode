package common;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/8/9 17:37
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
