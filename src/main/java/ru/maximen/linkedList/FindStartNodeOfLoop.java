package ru.maximen.linkedList;

public class FindStartNodeOfLoop {

    public static void main(String[] args) {

        Node<String> node11 = new Node<>("1");
        Node<String> node12 = new Node<>("2");
        Node<String> node13 = new Node<>("3");
        Node<String> node14 = new Node<>("4");
        Node<String> node15 = new Node<>("6");
        Node<String> node16 = new Node<>("7");
        Node<String> node17 = new Node<>("8");

        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;
        node15.next = node16;
        node16.next = node17;
        node17.next = node13;


        System.out.println(getStartLoop(node11).item);
        System.out.println(checkLoop(node11));
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

    private static Node getStartLoop(Node head){
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        while (fast!=null||fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                slow = head;
                while (slow!=fast){
                    slow = slow.next;
                    fast = fast.next;

                }
                return slow;
            }

        }
        return null;
    }

    private static boolean checkLoop(Node head){
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast!=null||fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) return true;
        }
        return false;
    }

}

