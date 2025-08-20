package Queue;

import Queue.Implementation_Using_LL.queue;

public class Implementing_Queue {
    queue ImplementedQueue = new queue();
    System.out.println(ImplementedQueue.display());
    System.out.println(ImplementedQueue.dequeue());
    System.out.println(ImplementedQueue.len());
    System.out.println(ImplementedQueue.enqueue(10));
    System.out.println(ImplementedQueue.display());
    System.out.println(ImplementedQueue.enqueue(20));
    System.out.println(ImplementedQueue.enqueue(30));
    System.out.println(ImplementedQueue.len());
    System.out.println(ImplementedQueue.display());
    System.out.println(ImplementedQueue.dequeue());
    System.out.println(ImplementedQueue.enqueue(50));
}
