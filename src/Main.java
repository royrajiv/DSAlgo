import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**

*/
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b.compareTo(a));
        maxPQ.offer(1);
        maxPQ.offer(3);
        maxPQ.offer(2);

        System.out.println("maxPQ removal 1 = "+maxPQ.poll());
        System.out.println("maxPQ removal 2 = "+maxPQ.poll());
        System.out.println("maxPQ removal 3 = "+maxPQ.poll());

        System.out.println("Hello World!");

        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.offer(1);
        minPQ.offer(3);
        minPQ.offer(2);

        System.out.println("minPQ removal 1 = "+minPQ.poll());
        System.out.println("minPQ removal 2 = "+minPQ.poll());
        System.out.println("minPQ removal 3 = "+minPQ.poll());

        // arr [1,3,2,4,5] : k=2 : return 2nd largest number
        // shd we use max Pqueue or min Pqueue ?
        // maxQ size 2 contents ? = 1,3 -> 2 ->

        int[] nums = {1,2,3,1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            if(map.get(i) != null && map.get(i)==1)
            {
                System.out.println("false");
            }
            else
            {
                map.put(i,1);
            }
        }

    }
}
