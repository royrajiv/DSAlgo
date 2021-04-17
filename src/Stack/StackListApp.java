package Stack;

class StackListApp {
    public static void main(String[] args) {
        StackListImpl theStack = new StackListImpl(); // make stack

        theStack.push(20); // push items
        theStack.push(40);
        theStack.displayStack(); // display stack
    }
}
