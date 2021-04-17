package Queue;

class QueueListApp {
    public static void main(String[] args) {
        QueueListImpl theQueue = new QueueListImpl();
        theQueue.insert(20); // insert items
        theQueue.insert(40);
        theQueue.displayQueue(); // display queue
    }
}
