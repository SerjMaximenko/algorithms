package ru.maximen.heap;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class TopKFrequentElements {
    public static void main(String[] args) {
        log.info(Arrays.toString(getTopKFrequentElements(new int[]{1, 1, 1, 2, 2, 3, 4, 5}, 2)));
    }

    public static int[] getTopKFrequentElements(int[] arr, int k){

        Map<Integer,Integer> count = new HashMap<>();

        for(int a: arr){
            count.put(a, count.getOrDefault(a, 0)+1);
        }
        log.info(count.toString());

        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(count::get));

        for(int c: count.keySet()){
            queue.add(c);
            if (queue.size()>k) queue.poll();
        }
        log.info(queue.toString());

        int[] out = new int[k];
        for(int i = k - 1; i >= 0; i--) {
            out[i] = queue.poll();
        }

        return out;
    }
}
