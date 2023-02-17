package day49_Collections;

import java.util.*;

public class QueuePractice {
                                        // YOU WILL NOT USE QUEUE ON DAY TO DAY
    public static void main(String[] args) {

        //PRIORITY QUEUE        -- DOES NOT KEEP INSERTION ORDER
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue);

        //ARRAY DEQUE           -- KEEPS INSERTION ORDER

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayDeque = " + arrayDeque);

        //LINKEDLIST            -- KEEPS INSERTION ORDER

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------------------------------");

        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);
        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

        System.out.println("------------------------------------------------");

        System.out.println("arrayDeque = " + arrayDeque);
        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println("------------------------------------------------");

        System.out.println("linkedList = " + linkedList);
        linkedList.poll();
        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------------------------------");

        System.out.println(((LinkedList<Integer>) linkedList).get(2));







    }
}
