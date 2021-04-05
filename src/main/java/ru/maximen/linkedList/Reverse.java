package ru.maximen.linkedList;

public class Reverse {
    public static void main(String[] args) {

        Node<String> node = new Node<>("1");
        Node<String> node1 = new Node<>("2");
        Node<String> node2 = new Node<>("3");
        Node<String> node3 = new Node<>("4");
        Node<String> node4 = new Node<>("5");
        Node<String> node5 = new Node<>("6");
        Node<String> node6 = new Node<>("7");
        Node<String> node7 = new Node<>("8");

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        node = reverseRec(node);

        node = reverseIter(node);

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

    private static Node reverseIter(Node head){
        Node previous = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    private static Node reverseRec(Node head){
        System.out.println(" h init " + head.item);
        if (head == null || head.next == null){
            return head;
        }
        Node p = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
