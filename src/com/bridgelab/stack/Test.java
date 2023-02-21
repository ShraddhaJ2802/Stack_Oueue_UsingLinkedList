package com.bridgelab.stack;

class QueueProgram {

    int key;
    QueueProgram next;
    public QueueProgram(int key)
    {
        this.key = key;
        this.next = null;
    }
}

 class Queue {
    QueueProgram front, rear;

    public Queue() {

        this.front = this.rear = null;
    }


    void enqueue(int key) {

        // Create a new LL node
        QueueProgram temp = new QueueProgram(key);

        // If queue is empty, then new node is front and
        // rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change
        // rear
        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;

        // Store previous front and move front one node
        // ahead
        QueueProgram temp = this.front;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as
        // NULL
        if (this.front == null)
            this.rear = null;
    }

    
}


