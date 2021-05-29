package A_ProgAbs;

import java.util.HashMap;
import java.util.Map;

/*
 For each of the two recursive implementations of the function Fib(n) presented in
 this chapter, write a recursive function (you can call these CountFib1 and
 CountFib2 for the two algorithms) that counts the number of function calls made
 during the evaluation of the corresponding Fibonacci calculation. Write a main
 program that uses these functions to display a table showing the number of calls
 made by each algorithm for various values of n, as shown in the following sample
 run:
  Fib (n) = F (n-1) + F (n-2)
  F(0) = 1
  F(1) = 1
         1 2 3 4 5 6
       0 1 1 2 3 5 8
 */
public class Problem5 {

    private static Map<Integer, Integer> memo = new HashMap<>();
    private static Map<Integer, Integer> countFibRec = new HashMap<>();
    private static Map<Integer, Integer> countFibMemo = new HashMap<>();
    public static void main(String[] args) {
        memo.put(0,1);
        memo.put(1,1);
        countFibMemo.put(0,1);
        countFibMemo.put(1,1);
        int n =6;
        System.out.println("Total fibRec =" + fibRec(n));
        System.out.println("Total fibMemo =" + fibMemo(n));

        for(int i =0; i<= n ; i++)
        {
            System.out.println("i= "+i+ " countFibRec= "+countFibRec.get(i) + " countFibMemo= "+countFibMemo.get(i) );
        }
    }

    private static int fibMemo(int n) {
/*
        if (n <= 1) {
            countFibMemo.put(n,countFibMemo.getOrDefault(n,0) +1);
            return n;
        }
*/
        if(memo.containsKey(n))
            return memo.get(n);
        else {
            int fib = fibMemo(n - 1) + fibMemo(n - 2);
            memo.put(n, fib);
            // if(!countFibMemo.containsKey(n))
            countFibMemo.put(n, countFibMemo.getOrDefault(n, 0) + 1);
            return fib;
        }
    }

    private static int fibRec(int n) {
        if (n <= 1)
        {
            countFibRec.put(n,countFibRec.getOrDefault(n,0) +1);
            return n;
        }
        int fib =  fibRec(n-1) + fibRec(n-2) ;
        countFibRec.put(n,countFibRec.getOrDefault(n,0) +1);
        return fib;
    }
}
