package Recursion.Backtracking_Stanford;

//Given a positive integer number N. The task is to generate all the decimal strings of N bits.
// https://www.youtube.com/watch?v=wiBPsaJs2yQ&t=445s
public class PrintAllDecimalApp {

    public static void main(String[] args) {
        System.out.println("Calculate printAllDecimal=");
        printAllDecimal(2);
    }

    public static void printAllDecimal(int n){
        printAllDecimalHelper(n,"");
    }

    public static void printAllDecimalHelper(int n, String soFar){
        if(n==0)
            System.out.println(soFar);
        else
        {
            // Observation : When the set of digit choices available is large
            // using a loop avoids redundancy. (This is okay)

            // for cases like this : loop is an elegant way to describe the different
            // successor calls to make, but overall process is still recursive.
            for(int i=0; i< 10; i++)
                printAllDecimalHelper(n-1,soFar + i);

            /*printAllDecimalHelper(n-1,output+"0");
            printAllDecimalHelper(n-1,output+"1");
            printAllDecimalHelper(n-1,output+"2");
            printAllDecimalHelper(n-1,output+"3");
            printAllDecimalHelper(n-1,output+"4");
            printAllDecimalHelper(n-1,output+"5");
            printAllDecimalHelper(n-1,output+"6");
            printAllDecimalHelper(n-1,output+"7");
            printAllDecimalHelper(n-1,output+"8");
            printAllDecimalHelper(n-1,output+"9");*/
        }
    }
}

/*
Input: 2
Output:
0 0
0 1
0 2
. .
. .
98
99


Input: 3
Output:
0 0 0
0 0 1
0 0 2
. . .
9 9 8
9 9 9
 */