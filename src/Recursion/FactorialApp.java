package Recursion;

public class FactorialApp {

    public static void main(String[] args)
    {
        int calcFactorialForNumber = 5;
        System.out.println("Calculate Factorial for nbr     ="+calcFactorialForNumber);
        System.out.println("Factorial                       ="+ factorial(calcFactorialForNumber));
    }

    private static long factorial(int n)
    {
        if(n==1) {
            System.out.println("Returning                   "+1);
            return 1;
        }
        else {
            System.out.println("Returning n:                " + n);
            return n * factorial(n - 1);
        }
    }
}
