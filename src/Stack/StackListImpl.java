package Stack;

public class StackListImpl {

    private LinkList stackList;

    public StackListImpl()
    {
        stackList = new LinkList();
    }

    public void push(long j) // put item on top of stack
    {
        stackList.insertHead(j);
    }

    public long pop() // take item from top of stack
    {
        return stackList.deleteHead();
    }

    public boolean isEmpty() // true if stack is empty
    {
        return stackList.isEmpty();
    }

    public void displayStack()
    {
        stackList.displayList();
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
        System.out.println("dData = " +dData);
    }
}

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

class StackListApp {
    public static void main(String[] args) {
        StackListImpl theStack = new StackListImpl(); // make stack

        theStack.push(20); // push items
        theStack.push(40);
        theStack.displayStack(); // display stack
    }
}