package Stack;

class LinkList {
    private Link head; // ref to head item on list

    public LinkList() // constructor
    {
        head = null;
    } // no items on list yet

    public boolean isEmpty() // true if list is empty
    {
        return (head == null);
    }

    public void insertHead(long dd) // insert at start of list
    {                                // make new link
        Link newLink = new Link(dd);
        newLink.next = head; // newLink --> old head
        head = newLink; // head --> newLink
    }

    public long deleteHead() // delete head item
    { // (assumes list not empty)
        Link temp = head; // save reference to link
        head = head.next; // delete it: head-->old next
        return temp.dData; // return deleted link
    }

    public void displayList() {
        Link current = head; // start at beginning of list
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
}
