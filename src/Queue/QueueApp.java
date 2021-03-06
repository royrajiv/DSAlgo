package Queue;

class QueueApp {
    public static void main(String[] args) {
        QueueArrayImpl theQueue = new QueueArrayImpl(5); // queue holds 5 items
        theQueue.insert(10); // insert 4 items
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.remove(); // remove 3 items
        theQueue.remove(); // (10, 20, 30)
        theQueue.remove();
        theQueue.insert(50); // insert 4 more items
        theQueue.insert(60); // (wraps around)

        while (!theQueue.isEmpty()) // remove and display
        { // all items
            long n = theQueue.remove(); // (40, 50, 60, 70, 80)
            System.out.println("Queue element = "+n);
        }
    }
}
