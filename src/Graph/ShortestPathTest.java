package Graph;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathTest {

    @org.junit.jupiter.api.Test
    void getShortestPath() {
        ShortestPath finder = new ShortestPath(8);
        finder.addEdge(0,1);
        finder.addEdge(0,3);
        finder.addEdge(1,2);
        finder.addEdge(3,4);
        finder.addEdge(3,7);
        finder.addEdge(4,5);
        finder.addEdge(4,6);
        finder.addEdge(4,7);
        finder.addEdge(5,6);
        finder.addEdge(6,7);
        Assert.assertEquals(2, finder.getShortestPath(0, 7));
//        Assert.assertEquals(1, finder.getShortestPath(4, 0));
//        Assert.assertEquals(2, finder.getShortestPath(0, 4));
//        Assert.assertEquals(3, finder.getShortestPath(1, 2));
//        Assert.assertEquals(1, finder.getShortestPath(0, 2));

    }
}