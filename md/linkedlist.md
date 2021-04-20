# Linked list

+ [Reverse Linked List](#reverse-linked-list)
+ [Intersection of Two Linked Lists](#intersection-of-two-linked-lists)
+ [Find loop](#find-loop)
+ [Find start node of a loop](#find-start-node-of-a-loop)
+ [Palindrome Linked List](#palindrome-linked-list)

## Reverse Linked List
 
https://leetcode.com/problems/reverse-linked-list/solution/

---

#### [Пример](src/main/java/ru/maximen/linkedList/Reverse.java)

### Итеративное
```java
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
```
### Рекурсивное
```java
private static Node reverseRec(Node head){
    if (head == null || head.next == null) return head;
    Node p = reverseRec(head.next);
    head.next.next = head;
    head.next = null;
    return p;
}
```
## Intersection of Two Linked Lists
 
https://leetcode.com/problems/intersection-of-two-linked-lists/solution/

---

#### [Пример](src/main/java/ru/maximen/linkedList/Intersection.java)

### Итеративное    
```java    
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
```        
## Find loop

https://leetcode.com/problems/linked-list-cycle/
   
---
 
#### [Пример](src/main/java/ru/maximen/linkedList/FindStartNodeOfLoop.java)
 
### Итеративное
```java
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
```            

## Find start node of a loop
        
https://leetcode.com/problems/linked-list-cycle-ii/ 
        
---

#### [Пример](src/main/java/ru/maximen/linkedList/FindStartNodeOfLoop.java)

### Итеративное  

```java      
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
```

## Palindrome Linked List
        
https://leetcode.com/problems/palindrome-linked-list/
        
---

#### [Пример](src/main/java/ru/maximen/linkedList/Palindrome.java)

### Итеративное     
```java
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
```