package A_ProgrammingAbstractions.Backtracking_Stanford;


/*
Given number of digits n in a number, print all n-digit numbers whose digits are strictly increasing from left to right.
Examples:


Input:  n = 2
Output:
01 02 03 04 05 06 07 08 09 12 13 14 15 16 17 18 19 23 24 25 26 27 28
29 34 35 36 37 38 39 45 46 47 48 49 56 57 58 59 67 68 69 78 79 89

Input:  n = 3
Output:
012 013 014 015 016 017 018 019 023 024 025 026 027 028 029 034
035 036 037 038 039 045 046 047 048 049 056 057 058 059 067 068
.................
 */
public class PrintStrictlyIncreasingNum {

    public static void main(String[] args) {
        System.out.println("Calculate printAllDecimal=");
        print(2);
    }

    public static void print(int n){
        printStrictlyIncreasingNum(n,0, "");
    }

    /*
  Input:  n = 2
Output:
01 02 03 04 05 06 07 08 09 12 13 14 15 16 17 18 19 23 24 25 26 27 28
29 34 35 36 37 38 39 45 46 47 48 49 56 57 58 59 67 68 69 78 79 89
     */
    public static void printStrictlyIncreasingNum(int n, int start, String soFar){
        if(n==0)
            System.out.println(soFar);
        else
        {
            for(int i=start; i< 10; i++) {
                //The idea is to use recursion.
                // We start from the leftmost position of a possible N-digit number and fill it from set of all digits
                // greater than its previous digit. i.e. fill current position with digits (i to 9)
                // where i is its previous digit.
                // After filling current position, we recurse for next position with strictly increasing numbers.
                printStrictlyIncreasingNum(n - 1,i+1, soFar + i);
            }
        }
    }
}

