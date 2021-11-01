package common;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return val == node.val && Objects.equals(next, node.next) && Objects.equals(random, node.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next, random);
    }
}
