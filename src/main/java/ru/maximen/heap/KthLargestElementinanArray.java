package ru.maximen.heap;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

@Slf4j
public class KthLargestElementinanArray {

    public static void main(String[] args){
     log.info(String.valueOf(getKthLargestElementinanArray(new int[]{1,2,32,3,4,2,3,2,3,4,11,233,323,4,5,6}, 3)));
    }

    static int getKthLargestElementinanArray(int[] in, int k){

        Queue<Integer> queue = new PriorityQueue<>();

        for (int i: in){
            queue.add(i);
            if (queue.size() > k) queue.poll();
        }

        return queue.poll();
    }
}
