package ru.maximen.linkedList;

public class Intersection {

    public static void main(String[] args) {

        Node<String> node11 = new Node<>("1");
        Node<String> node12 = new Node<>("2");
        Node<String> node13 = new Node<>("3");
        Node<String> node14 = new Node<>("4");

        Node<String> node21 = new Node<>("6");
        Node<String> node22 = new Node<>("2");
        Node<String> node23 = new Node<>("21");

        node11.next = node12;
        node12.next = node13;
        node13.next = node14;

        node21.next = node22;
        node22.next = node23;
        node23.next = node14;

        System.out.println(getIntersectionNodeIter(node11, node21).item);

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

    private static Node getIntersectionNodeIter(Node a, Node b){

        Node locA = a;
        while (locA != null) {
            Node locB = b;
            while (locB != null) {
                if (locA == locB) return locA;
                locB = locB.next;
            }
            if (locA == locB) return locA;
            locA = locA.next;
        }
        return null;
    }

    private static Node getIntersectionNodeRec(Node a, Node b){

        if ((b==null)&(a==null)) return null;

        if (a!=b) {
            getIntersectionNodeRec(a, b.next);
        } else return a;

        return null;
    }
}
