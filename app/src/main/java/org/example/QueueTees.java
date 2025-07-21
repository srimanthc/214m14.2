package org.example;

import java.util.ArrayList;

public class QueueTees {
    private ArrayList<Cutie> queue;
    private int maxSize;

    public QueueTees() {
        this.maxSize = 10;
        this.queue = new ArrayList<>();
    }

    public void enqueue(Cutie c) {
        if (queue.size() >= maxSize) {
            System.out.println("Queue is full. Cannot add: " + c.description());
        } else {
            queue.add(c);
        }
    }

    public Cutie dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            return queue.remove(0);
        }
    }

    public int size() {
        return queue.size();
    }

    public void clear() {
        queue.clear();
        System.out.println("Queue has been cleared.");
    }
}

