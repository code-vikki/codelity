package DataStructure.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class QueueDemo {

    public static void main(String[] args) {
//        ArrayDeque arrayDeque = new ArrayDeque();
//
//        System.out.println(arrayDeque.peek());
//        System.out.println(arrayDeque);

        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.add(10);
        arrayQueue.add(20);
        arrayQueue.add(30);
        arrayQueue.add(40);
        arrayQueue.add(50);
        System.out.println(arrayQueue);
        System.out.println(arrayQueue.isFull());


    }

}
