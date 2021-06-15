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

Based on learning of Fib series (bottom-up), we can see that the flow is :
    Counting Problem -> Recurrence equation -> Bottom-up implementation


@TODO In general, from a given counting problem we can go to a recurrence equation,
and then we have to think how to solve this recurrence equation in a smart way,
where we don't do repetitive work and that then would lead us to a dynamic programming based solution.
which runs efficiently w.r.t to Time Complexity although space complexity maybe a bit high.

Lets look at a problem where we have to do both of these steps in sequence.
@TODO i.e: Counting -> then recurrence -> then DP

lets derive Recurrence relation:
n=1  steps = 1
n=2  steps = 2
n=3  steps = 3

so, how do we derive F(n) ??

So, whenever you are given a computational problem and you dont know where to start:
One good place to start is our general algorithm design strategies like:
  brute-force (not tangible strategy)
  decrease and conquer strategy. (tangible strategy)

Sorting decrease and conquer strategy
In sorting, what if (n-1) elements in our array was given to us in sorted order.
how would we then extend the solution to the problem of size N.
and we did that by inserting the last/nth element into its right place.
and that led us to insertion sort algorithm.

In decrease and conquer we try to chip away the problem, little bit, it could be from left end.
it could be from right end, in this case I am going to go from the right end.

Lets focus on the last step. The last step could have been initiated from the previous step OR 2nd previous step.
DP(n) = DP(n-1) + DP(n-2) (unique no. of ways)

Time complexity : O(n)O(n). Single loop upto nn.
Space complexity : O(n)O(n). dpdp array of size nn is used.

 */
public class ClimbingStairsIKWeb {

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

        for(int i =3; i<=n; i++)
            dp[i] = dp[i-1] + dp[i-2];

        return dp[n];
    }
}
