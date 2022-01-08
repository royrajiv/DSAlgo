package Recursion;

public class FactorialApp {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Calculate Factorial for nbr     =" + n);
        System.out.println("Factorial                       =" + factorial(n));
    }

    private static long factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
