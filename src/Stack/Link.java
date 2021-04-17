package Stack;

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
