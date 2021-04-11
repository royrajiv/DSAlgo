package LinkedList;

public class LinkedList {
    private Link head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() // true if list is empty
    {
        return head == null;
    }

    // insert at start of list
    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = head;
        head = newLink;
    }

    public Link deleteFirst() // delete first item
    {
        if (head == null)
            return null;
        Link temp = head;
        head = head.next;
        return temp;
    }

    public void displayList() {
        Link current = head;
        while (current != null) {
            current.displayLink();
            System.out.println(" ");
            current = current.next;
        }
    }
}

class Link {
    public int iData; // data item (key)
    public double dData; // data item
    public Link next; // next link in list

    public Link(int id, double dd) // constructor
    {
        iData = id; // initialize data
        dData = dd; // (‘next’ is automatically set to null
    }

    public void displayLink() // display yourself
    {
        System.out.print(" {" + iData + ", " + dData + "} ");
    }
}

class LinkedListApp{

    public static void main(String[] args){
        LinkedList theList = new LinkedList();

        theList.insertFirst(22, 2.99); // insert four items
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);
        System.out.println("Displaying List ");
        theList.displayList(); // display list
        while( !theList.isEmpty() ) // until it’s empty,
        {
            Link aLink = theList.deleteFirst(); // delete link
            System.out.print("Deleted "); // display it
            aLink.displayLink();
            System.out.println(" ");
        }
        theList.displayList(); // display list

    }
}
