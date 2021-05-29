package A_ProgAbs;

/**
 * Spherical objects, such as cannonballs, can be stacked to form a pyramid with one
 * cannonball at the top, sitting on top of a square composed of four cannonballs, sitting
 * on top of a square composed of nine cannonballs, and so forth. Write a recursive
 * function Cannonball that takes as its argument the height of the pyramid and returns
 * the number of cannonballs it contains. Your function must operate recursively and
 * must not use any iterative constructs, such as while or for.
 *
 *                    * (1)
 *                  **** (4)
 *                ********* (9)
 *
 * //  Level   # Balls
 * //  ------- -------
 * //  1
 * 1
 * //  2       2^2 = 4
 * //  3       3^2 = 9
 * //  4       4^2 = 16
 * //  ----------------
 * //  Total  1+4+9+16 = 30 balls
 *
 * Recurrence relation =
 *  height = n
 *
 *  n^2 + (n-1)^2 + (n-2)^2 + .... (1)^2
 *
 */
public class Problem1 {

    public static void main(String[] args) {
        int height = 4;
        System.out.println("Calculate Canonballs for height     =" + height);
        System.out.println("Total             =" + calculateNbrOfCanonBalls(height));
    }

    private static int calculateNbrOfCanonBalls(int n)
    {
        if(n ==1 )
            return 1;
        else
            return n * n +  calculateNbrOfCanonBalls(n -1);
    }
}
