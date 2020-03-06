package question1.linkedlist;

import java.util.Objects;

/**
 * A node in a singly-linked list.
 */
public class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final ListNode listNode = (ListNode) o;
        return data == listNode.data &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        return "(" + data + ")";
    }
}
