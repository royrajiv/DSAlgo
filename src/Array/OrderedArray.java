package Array;

public class OrderedArray {
    private long[] a; // ref to array a
    private int nElems; // number of data items

    public OrderedArray(int maxSize) {
        this.nElems = 0;
        a = new long[maxSize];
    }

    public int size() {
        return nElems;
    }

    // sorted array -- NO duplicates
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn; // found it
            else if (lowerBound > upperBound)
                return nElems; // can’t find it
            else // divide range
            {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1; // it’s in upper half
                else
                    upperBound = curIn - 1; // it’s in lower half
            } // end else divide range
        }
    }

    public void insert(long value) // put element into array
    {
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
            if (a[j] > value) // (linear search)
                break;
        for (int k = nElems; k > j; k--) // move bigger ones up
            a[k] = a[k - 1];
        a[j] = value; // insert it
        nElems++; // increment size
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) // can’t find it
            return false;
        else // found it
        {
            for (int k = j; k < nElems; k++) // move bigger ones down
                a[k] = a[k + 1];
            nElems--; // decrement size
            return true;
        }
    }

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
            System.out.print(a[j] + "  "); // display it
        System.out.println("  ");
    }
}

class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100; // array size
        OrderedArray arr; // reference to array

        arr = new OrderedArray(maxSize); // create the array
        arr.insert(77); // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        System.out.println("array elements");
        arr.display(); // display items


        int searchKey = 55; // search for item
        System.out.println("Find element " + searchKey);
        if (arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can’t find " + searchKey);
        System.out.println("delete 3 items");
        arr.delete(00); // delete 3 items
        arr.delete(55);
        arr.delete(99);

        System.out.println("array after deletion");
        arr.display(); // display items again
    }
}