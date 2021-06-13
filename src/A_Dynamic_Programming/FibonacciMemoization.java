package A_Dynamic_Programming;

import java.util.HashMap;
import java.util.Map;

/*
Without memoization:
  Fib (n) = F (n-1) + F (n-2)
  F(0) = 1
  F(1) = 1

   F(4) = F(3) + F(2)

   Recursion tree -> remember left tree/child gets executed first..basically in-order traversal

Time Complexity:
                F(n)
               /       \
         F(n-1)             F(n-2)
         /   \           /        \
     F(n-2)  F(n-3)    F(n-3)    F(n-4)

So: left path : root to left most child straight line : decrementing by a size 1 in each sub-problem
So: right path : root to right most child straight line : decrementing by a size of 2  in each sub-problem

Hence: right path will have n/2 edges, shortest path : hit leaf level nodes pretty quickly.
left path = longest path in rec tree since sub-problem size reduces by 1 for each edge.
intermediate paths : length will vary between longest and shortest.

But till n/2 depth : tree would be completely filled, below that depth, wavy structure, since
intermediate path lengths may vary.

Time Complexity : is proportional to the number of nodes in the tree, since each node is doing constant
amount of work.

why constant amount of work:  each subproblem is taking a problem from its boss.
dividing the problem into two smaller sub-problems and delegating it to its sub-ordinates.
when sub-ordinates return with values for their completed work, it adds the values and returns to its boss.
so: all this takes a constant amount of work.

So: what is the total number of nodes.
lets calculate total nodes for fully filled up tree of n/2 depth (below tht difficult calculation)
B-Tree:
Level 0 :  1 node
Level 2 :  2 nodes
Level 3 : 4 (2^2) nodes
Level 4 : 8 (2^3) nodes
...
Level n/2 : 2^n/2 nodes

Total nodes = 1+ 2+ 2^2+ 2^3....+2^n/2
= 2^n/2  -1
= 2^n

T(n) = 2^n

Memoization: comes from memorandum : using cache to avoid repeated calculation.

@TODO roughly n nodes in the tree.
 Only left most rec tree gets created of depth n.
 we have seen time complexity is directly proportional to number of nodes.
 Hence T(n) = same as number of nodes in the tree = O(n)

@TODO space complexity
we had to use an extra cache(hashmap) to store results.
memo-cache would be storing roughly O(n) results, so we need O(n) extra space to cache our results.
S(n) = O(n)

So, basically we are trading off Space for Time.

@TODO general approach to memomization:
Although this example is for Fibonacci Series, the method used to memoize is a general method.
It can be used to memoize any recursive code.
All that you need to do is take the base cases
and initialize your memo cache with the base cases, so that way you dont need to handle base cases explicitly in your code.
And your actual code can focus on computing the answer to recursive case.
And once you have computed the answer to the recursive case, you cache it.
And then you return the answer.

@TODO memoization is general and can be applied to any recursive case.
Of-course it will help where there is lot of repeated work being done.

 */
public class FibonacciMemoization {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        memo.put(0, 1);
        memo.put(1, 1);
        int n = 5;
        System.out.println("Fib for nth term="+fibMemo(n));
    }

    private static int fibMemo(int n) {
        if (memo.containsKey(n))
            return memo.get(n);
        else {
            int fib = fibMemo(n - 1) + fibMemo(n - 2);
            memo.put(n, fib);
            return fib;
        }
    }


}
