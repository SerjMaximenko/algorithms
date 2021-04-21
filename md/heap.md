# Heap

+ [Top K Frequent Elements](#Top-K-Frequent-Elements)
+ [Kth Largest Elementinan Array](#Kth-Largest-Elementinan-Array)

## Top K Frequent Elements
 
https://leetcode.com/problems/top-k-frequent-elements/

---

#### [Пример](src/main/java/ru/maximen/heap/TopKFrequentElements.java)

```java
public static int[] getTopKFrequentElements(int[] arr, int k){

    Map<Integer,Integer> count = new HashMap<>();

    for(int a: arr){
        count.put(a, count.getOrDefault(a, 0)+1);
    }

    Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(count::get));

    for(int c: count.keySet()){
        queue.add(c);
        if (queue.size()>k) queue.poll();
    }

    int[] out = new int[k];
    for(int i = k - 1; i >= 0; i--) {
        out[i] = queue.poll();
    }

    return out;
}
```

## Kth Largest Elementinan Array
 
https://leetcode.com/problems/kth-largest-element-in-an-array/

---

#### [Пример](src/main/java/ru/maximen/heap/KthLargestElementinanArray.java)

```java
public static int getKthLargestElementinanArray(int[] in, int k){

    Queue<Integer> queue = new PriorityQueue<>();

    for (int i: in){
        queue.add(i);
        if (queue.size() > k) queue.poll();
    }

    return queue.poll();
}
```