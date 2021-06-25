package A_Dynamic_Programming;

/*
https://leetcode.com/problems/unique-paths/
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time.
The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
How many possible unique paths are there?

Framework:
1> F(i,j) = Total no. of ways to get to position (i,j)
2> Base Cases: Solve the problem when computer is not even needed.
    Matrix size = 1X1 : F(1,1) = 1
    Matrix size = 2X2 : F(2,2) = 2
3> Transition function: lets think of the problem as if it is already solved.
    Lets say we are standing at the end position F(m,n)
    How can we get there ?
    1> Either we can get there from above 2> OR we can get there from the left.
    F(m-1,n) + F(m,n-1)



 */
public class UniquePaths {

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println("No Of UniquePaths="+noOfUniquePaths(m, n));
    }

    private static int noOfUniquePaths(int m, int n)
    {
        int[][] dp = new int[m][n];

        //only 1 way to go from 1st column to last column in row 1
        for(int i=0;i<n;i++)
            dp[0][i] = 1;

        //only 1 way to go from 1st row to last row in column 1
        for(int i=0;i<m;i++)
            dp[i][0] = 1;

        for(int i=1; i< m; i++)
            for(int j=1; j<n; j++)
                dp[i][j] = dp[i-1][j] + dp[i][j-1];

        return dp[m-1][n-1];
    }

}
