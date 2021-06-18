package A_Dynamic_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Optimization Problem: that means we want to find minimum or maximum value.

@TODO Lets modify the Climbing stairs problem to find cheapest way to the top II.
@TODO Return the cheapest path to the top of the Staircase.

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

@TODO first we need to construct the entire path, and then traverse back to get the best path.
 */
public class ClimbingStairsPaidPath {
    public static void main(String[] args) {
        int n = 8;
        int[] p = {0, 3, 2, 4, 6, 1, 1, 5, 3};
        System.out.println("Climbing Stairs=" + paidStaircase(n, p));
    }

    private static Integer[] paidStaircase(int n, int[] p) {
        int[] dp = new int[n + 1];
        int[] fromStair = new int[n + 1];
        dp[0] = 0;
        dp[1] = p[1];

        for (int i = 2; i <= n; i++) {
            dp[i] = p[i] + Math.min(dp[i - 1], dp[i - 2]);

            if (dp[i - 1] < dp[i - 2])
                fromStair[i] = i - 1;
            else
                fromStair[i] = i - 2;
        }
        //path = 0,0,0,2,2,3,5,5,6
        System.out.println("fromStair=" + fromStair);

        //above for loop built the entire path
        //Now, trace the actual traversed path backwards.
        List<Integer> pathList = new ArrayList<>();
        for (int curr = n; curr > 0; curr = fromStair[curr]) {
            pathList.add(curr);
        }
        pathList.add(0);
        //prints 8,6,5,3,2,0
        System.out.println("pathList=" + pathList);

        Collections.reverse(pathList);

        Integer[] traversedPath = pathList.toArray(new Integer[0]);
        return traversedPath;
        //answer shd be: 0,2,3,5,6,8
    }


}
