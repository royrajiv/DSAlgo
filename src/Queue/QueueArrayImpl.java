package Queue;

public class QueueArrayImpl {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueArrayImpl(int size) {
        this.maxSize = size;
        queArray = new long[maxSize];
        front = 0;
        rear = 0;
        nItems = 0;
    }

    public void insert(long j) // put item at rear of queue  (also called enqueue)
    {
        if(rear == maxSize-1) // deal with wraparound
            rear = -1;
        queArray[++rear] = j; // increment rear and insert
        nItems++; // one more item
    }

    public long remove() // take item from front of queue (also called dequeue)
    {
        long temp = queArray[front++]; // get value and incr front
        if(front == maxSize) // deal with wraparound
            front = 0;
        nItems--; // one less item
        return temp;
    }

    public long peekFront() // peek at front of queue
    {
        return queArray[front];
    }

    public boolean isEmpty() // true if queue is empty
    {
        return (nItems==0);
    }

    public boolean isFull() // true if queue is full
    {
        return (nItems==maxSize);
    }

    public int size() // number of items in queue
    {
        return nItems;
    }
}

