package A_ProgrammingAbstractions;

/**
 * Unlike many programming languages, C++ does not include a predefined operator
 * that raises a number to a power. As a partial remedy for this deficiency, write a
 * recursive implementation of a function
 * int RaiseIntToPower(int n, int k)
 * that calculates nk. The recursive insight that you need to solve this problem is the
 * mathematical property that
 * <p>
 * n^k =    1  if k=0
 * otherwise
 * n^k =    n x n^(k–1)
 */
public class Problem2 {

    public static void main(String[] args) {
        System.out.println("Total  =" + raiseIntToPower(2, 5));
    }

    private static int raiseIntToPower(int n, int k) {
        if (k == 0)
            return 1;
        else
            return n * raiseIntToPower(n, k-1);
    }
}
