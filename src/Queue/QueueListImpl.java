package Queue;

public class QueueListImpl {
    FirstLastList queueList;

    public QueueListImpl() {
        queueList = new FirstLastList();
    }

    public void insert(long j) // put item at rear of queue  (also called enqueue)
    {
        queueList.insertLast(j);
    }

    public long remove() // take item from front of queue (also called dequeue)
    {
        return queueList.deleteFirst();
    }

    public boolean isEmpty() // true if queue is empty
    {
        return queueList.isEmpty();
    }

    public void displayQueue()
    {
        System.out.println("Queue (front-->rear): ");
        queueList.displayList();
    }
}

