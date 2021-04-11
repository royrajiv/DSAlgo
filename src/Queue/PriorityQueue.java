package Queue;

import java.io.IOException;

public class PriorityQueue {
    // array in sorted order, from max at 0 to min at size-1
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQueue(int size) {
        maxSize = size;
        queArray = new long[size];
        nItems = 0;
    }

    public void insert(int item) {
        if (nItems == 0) {
            queArray[nItems++] = item;
            return;
        }
        if (nItems == maxSize)
            return;

        // 5(0),3(1),2(2) : insert 4 : nItems = 3 : mazsize = 10
        // nItems=3, j=1:
        // k=2; 2>1
        // k -> 2 -> 1 -> 0 (breaks)
        int k;
        for (k = nItems - 1; k >= 0; k--) {   // start at end
            if (item > queArray[k])            // if new item is larger or array item is smaller
                queArray[k + 1] = queArray[k];  // shift upward
            else                              // if new item is smaller
                break;                        // done shifting
        }
        queArray[k + 1] = item;
        nItems++;
    }

    public long remove() // remove minimum item
    {
        return queArray[--nItems];
    }

    public long peekMin() // peek at minimum item
    {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() // true if queue is empty
    {
        return nItems == 0;
    }

    public boolean isFull() // true if queue is full
    {
        return nItems == maxSize;
    }
}

class PriorityQApp {
    public static void main(String[] args) throws IOException {

        PriorityQueue thePQ = new PriorityQueue(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while( !thePQ.isEmpty() )
        {
            long item = thePQ.remove();
            System.out.print(item + " "); // 10, 20, 30, 40, 50
        }

    }
}