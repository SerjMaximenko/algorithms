package ru.maximen.linkedList;

public class Palindrome {

    public static void main(String[] args) {

    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isEquals(Node node1, Node node2){
        while (node1 != null){
            if (!node1.item.equals(node2.item)) return false;
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }

    public boolean isPaly(Node head){
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast!=null||fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast!=null) {
            slow = slow.next;
        }

        slow = reverse(slow);

        return isEquals(head, slow);
    }

}


