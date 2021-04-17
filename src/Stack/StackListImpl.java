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

