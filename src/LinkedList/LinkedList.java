package LinkedList;
/*
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
*/

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

