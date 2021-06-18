package A_Dynamic_Programming;

/*
Optimization Problem: that means we want to find minimum or maximum value.

@TODO Lets modify the Climbing stairs problem to find cheapest way to the top.

Set of problems: asking you to find cheapest/shortest/longest etc type of problems
in majority of cases is an Optimization problem.
meaning you can try to apply ideas of Dynamic Programming.

n = 3 : 3 steps
k =2  : 1 or 2 steps allowed to take at a time.
price: to reach a stair.
  1st step: 3$
  2nd step: 2$
  3rd step: 4$

Framework:
1> F(i) = minimum cost to get to ith stair
2> base cases: F(0) = 0$
               F(1) = 3$
               F(2) = 2$ -- direct jump of 2 steps
               F(3) = 6$ (2+4 < 3+4 < 3+2+4)
3> transition function: perspective from end of the problem
  F(n) = P(n) + min(F(n-1), F(n-2))

4> Order : bottom-up
5> last operation =  F(n)

T(n) = O(n)
S(n) = O(n)
 */
public class ClimbingStairsPaid
{
    public static void main(String[] args) {
        int n = 3;
        int[] p = {0,3,2,4};
        System.out.println("Climbing Stairs="+paidStaircase(n,p));
    }

    private static int paidStaircase(int n, int[] p)
    {
        if(n==1)
            return 1;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 3;

       for(int i =2; i<=n; i++)
            dp[i] = p[i] + Math.min(dp[i-1],dp[i-2]);

        return dp[n];
    }


}
