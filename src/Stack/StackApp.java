package Stack;

class StackApp
{
    public static void main(String[] args)
    {
        StackArrayImpl stack = new StackArrayImpl(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty())
            System.out.println("Stack element = " +stack.pop());

        System.out.println("Program End");
    }
}
