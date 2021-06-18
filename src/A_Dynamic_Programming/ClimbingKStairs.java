package A_Dynamic_Programming;

/*
Another variation of the problem: Climbing 3 steps.
i.e: Each time you can either climb 1 or 2 or 3 steps.
In how many distinct ways can you climb to the top?

Steps:
1> Define the objective function
    F(i) = number of distinct ways to reach ith stair.
2> Identify base-cases
    F(0) = 1, F(1) = 1, F(2) = 2
3> Write down the transition function (recurrence relation)
    F(n) = F(n-1) + F(n-2) + F(n-3)
4> Identify the order of execution
5> Identify the location of the answer

https://www.geeksforgeeks.org/count-ways-reach-nth-stair/

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

public class ClimbingKStairs {

    /*
    Generalization of the Problem
    How to count the number of ways if the person can climb up to m stairs for a given value m.
    For example, if m is 4, the person can climb 1 stair or 2 stairs or 3 stairs or 4 stairs at a time.

    https://www.youtube.com/watch?v=fiPLaxkhdcQ

     */
    public static void main(String args[]) {
        int n = 9, k = 2;
        System.out.println("Number of ways = "
                + countWaysRecursive(n, k));

        System.out.println("Number of DP ways = "
                + countWaysDP(n, k));
    }

    static int countWaysUtil(int n, int k) {
        if (n <= 1)
            return n;
        int res = 0;
        for (int i = 1; i <= k && i <= n; i++)
            res += countWaysUtil(n - i, k);
        return res;
    }

    // Returns number of ways to reach s'th stair
    static int countWaysRecursive(int n, int k) {
        return countWaysUtil(n + 1, k);
    }


    // T(n) = O(n*k)
    // S(n) = O(n)
    static int countWaysDP(int n, int k) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;

        //dp[i] = dp[i-1] + dp[i-2] + dp[i-3]....dp[i-k]
        for(int i=2;i<=n; i++)
            for(int j=1; j<=k; j++)
            {
                if(i-j <0)
                    continue;
                dp[i] = dp[i] + dp[i-j];
            }
        return dp[n];
    }
}


/*
what if steps are {1, 3, 5}  ?
by using recursion u can
if(n<0)return 0;
 if (n==0) return 1;
if(n==1) return 1;
 if (n==3) return 2;
if(n==5) return 5;
return findstep[n-5]+ findstep[n-3]+ findstep[n-1];

and by using dynamic concept
findstep[0]=1;
findstep[1]=1;
findstep[2]=1;
findstep[3]=2;
findstep[4]=3;
findstep[5]=5;
and by applying for loop for(int i=6;i<=n;i++)
findstep[i]=findstep[i-1]+findstep[i-3]+findstep[i-5];
return findstep[n];

hope u get it brother



 */