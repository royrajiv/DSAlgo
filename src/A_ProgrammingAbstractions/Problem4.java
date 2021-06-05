package A_ProgrammingAbstractions;

/**
 * Write an iterative implementation of the function Fib(n).
 * <p>
 * Fib (n) = F (n-1) + F (n-2)
 * F(0) = 1
 * F(1) = 1
 *   1 2 3 4 5 6
 * 0 1 1 2 3 5 8
 */
public class Problem4 {

    public static void main(String[] args) {
        System.out.println("Total  =" + fib(6));
    }

    private static int fib(int n) {
        if(n <=1)
            return n;
        int fib1 = 0;
        int fib2 = 1;
        int fib=0;
        for(int i=2 ; i<= n; i++)
        {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }
}
