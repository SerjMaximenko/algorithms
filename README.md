# Reverse LinkedList
 
https://leetcode.com/problems/reverse-linked-list/solution/

---

#### [Пример](src/main/java/ru/maximen/linkedList/Reverse.java)

### Итеративное
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
### Рекурсивное
    private static Node reverseRec(Node head){
        if (head == null || head.next == null) return head;
        Node p = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    
# Intersection of Two Linked Lists
 
https://leetcode.com/problems/intersection-of-two-linked-lists/solution/

---

#### [Пример](src/main/java/ru/maximen/linkedList/Intersection.java)

### Итеративное    
    
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