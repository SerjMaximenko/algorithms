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
        
# Find loop

https://leetcode.com/problems/linked-list-cycle/
   
---
 
### Итеративное
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
        
        
# Find start node of loop
        
https://leetcode.com/problems/linked-list-cycle-ii/ 
        
---

### Итеративное        
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
    
