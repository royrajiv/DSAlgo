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

class Link {
    public long dData; // data item
    public Link next; // next link in list

    public Link(long dd) // constructor
    {
        dData = dd;
    }

    public void displayLink() // display ourself
    {
        System.out.println("dData = " + dData);
    }
}

class FirstLastList {
    private Link first; // ref to first item
    private Link last; // ref to last item

    public FirstLastList() // constructor
    {
        first = null; // no items on list yet
        last = null;
    }

    public boolean isEmpty() // true if no links
    {
        return first == null;
    }

    public void insertLast(long dd) // insert at end of list
    {
        Link newLink = new Link(dd); // make new link
        if (isEmpty()) // if empty list,
            first = newLink; // first --> newLink
        else
            last.next = newLink; // old last --> newLink
        last = newLink; // newLink <-- last
    }

    public long deleteFirst() // delete first link
    { // (assumes non-empty list)
        long temp = first.dData;
        if (first.next == null) // if only one item
            last = null; // null <-- last
        first = first.next; // first --> old next
        return temp;
    }

    public void displayList() {
        Link current = first; // start at beginning
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
}

class QueueListApp {
    public static void main(String[] args) {
        QueueListImpl theQueue = new QueueListImpl();
        theQueue.insert(20); // insert items
        theQueue.insert(40);
        theQueue.displayQueue(); // display queue
    }
}