package A_IKWeb;

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
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Climbing Stairs");
    }
}
