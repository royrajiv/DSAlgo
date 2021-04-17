package Stack;

public class StackArrayImpl {
    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top; // top of stack

    public StackArrayImpl(int size)
    {
        this.maxSize = size; // set stack size
        stackArray = new long[maxSize]; // initialize stack array
        top=-1; // no items yet
    }

    public void push(long e) // put item on top of stack
    {
        if(isFull()) {
            System.out.println("Stack Full : Element not added");
            return;
        }

        stackArray[++top]=e; // increment top, insert item
    }

    public long pop() // take item from top of stack
    {
        if(isEmpty())
        {
            System.out.println("Stack Empty : Default return value -1");
            return -1; // or null in case of stack of objects :)
        }
        return stackArray[top--]; // access item, decrement top
    }

    public long peek() // peek at top of stack
    {
        // have not added empty check for now
        return stackArray[top];
    }

    public boolean isEmpty() // true if stack is empty
    {
        return top == -1;
    }

    public boolean isFull() // true if stack is full
    {
        return top ==  maxSize-1;
    }
}











