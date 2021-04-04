#Reverse LinkedList
 
https://leetcode.com/problems/reverse-linked-list/solution/

---

####[Пример](src/main/java/ru/maximen/linkedList/Reverse.java)

###Итеративное
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
###Рекурсивное
    private static Node reverseRec(Node head){
        if (head == null || head.next == null) return head;
        Node p = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }