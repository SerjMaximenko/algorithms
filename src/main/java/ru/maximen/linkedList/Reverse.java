package ru.maximen.linkedList;

public class Reverse {
    public static void main(String[] args) {

        Node<String> node = new Node<>("1");
        Node<String> node1 = new Node<>("2");
        Node<String> node2 = new Node<>("3");
        Node<String> node3 = new Node<>("4");

        node.next = node1;
        node1.next = node2;
        node2.next = node3;

        Node nodeList = node;
        while (nodeList != null) {
            System.out.println(nodeList.item);
            nodeList = nodeList.next;
        }

        nodeList = reverseIter(node);
        while (nodeList != null) {
            System.out.println(nodeList.item);
            nodeList = nodeList.next;
        }

        nodeList = reverseRec(node3);
        while (nodeList != null) {
            System.out.println(nodeList.item);
            nodeList = nodeList.next;
        }
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
        if (head == null || head.next == null) return head;
        Node p = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
