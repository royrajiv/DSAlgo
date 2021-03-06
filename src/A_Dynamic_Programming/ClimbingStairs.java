package A_Dynamic_Programming;

/*
https://leetcode.com/problems/climbing-stairs/

You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
================================================================================

how do we solve this problem well the first thing we need to do is to express our goal as an
objective function what is an objective function the objective function is the
function that you want to minimize or maximize in your problem.

It's always a good idea to write your objective function down
and along with its description it will help you to solve the problem faster
also defining the objective function is almost 50% of the solution the
definition of the objective function is usually in the problem description
itself you will soon learn to write objective functions on your own.

F(i) = number of steps to the ith stair.

now the second step is to break the problem down into simpler sub problems
and identify the base cases. Remember dynamic programming is always
about breaking down the problem into simpler sub problems into smaller sub
problems and we need base cases to identify boundaries of the problem.
How do we do that, what I usually do is solve the problem for such small input well values
that a computer is not even needed.
well,lets do that, let's solve this problem for then when we only have two staircases.
let's do it here.

F(i) = number of steps to the ith stair.
______________________________________________
F(2) = 2 (1 step twice OR 2 step once)
F(1) = 1
F(0) = 1 (doing nothing also counts as a way to get to the top)

F(n) = F(n-1) + F(n-2)
In Combinatorics this is called rule of sum or addition principle.

Steps:
1> Define the objective function
2> Identify base-cases
3> Write down the transition function (recurrence relation)
4> Identify the order of execution
5> Identify the location of the answer

                   fib(5)
           '3'  /        \   '2'
               /          \
           fib(4)         fib(3)
     '2'  /      \ '1'   /      \
         /        \     /        \
     fib(3)     fib(2)fib(2)      fib(1)
     /    \ '1' /   \ '0'
'1' /   '1'\   /     \
   /        \ fib(1) fib(0)
fib(2)     fib(1)

*/
public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Climbing Stairs="+noOfUniqueWays(n));
    }

    private static int noOfUniqueWays(int n)
    {
        if(n==1)
            return 1;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        //to achieve O(1) space complexity, define 2 temp variables
        //keep assigning i-1, i-2 values to them
        // a=i-2, b=i-1, c= a+b
        // a=b, b=c

        for(int i =3; i<=n; i++)
            dp[i] = dp[i-1] + dp[i-2];

        return dp[n];
    }
}
