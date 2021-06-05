package A_ProgrammingAbstractions;

/*
    The digital root of an integer n is defined as the result of summing the digits
    repeatedly until only a single digit remains. For example, the digital root of 1729
    can be calculated using the following steps:
    Step 1: 1 + 7 + 2 + 9 % 19
    Step 2: 1 + 9 % 10
    Step 3: 1 + 0 % 1

    Because the total at the end of step 3 is the single digit 1, that value is the digital
    root.
    Write a function DigitalRoot(n) that returns the digital root of its argument.
    Although it is easy to implement DigitalRoot using the DigitSum function from
    exercise 6 and a while loop, part of the challenge of this problem is to write the
    function recursively without using any explicit loop constructs.
 */
public class Problem7 {

    private static int[] arr = new int[10];
    public static void main(String[] args) {
        System.out.println("Total 1729 =" + digitalRoot(1729));
        System.out.println("Total 1239 =" + digitalRoot(1239));
        System.out.println("Total 1 =" + digitalRoot(1));
    }

    private static int digitalRoot(int n) {
        if(digitSum(n) <10)
            return digitSum(n);
        return digitalRoot(digitSum(n));
    }

    private static int digitSum(int n) {
        if(n <10)
            return n;
        return n%10 + digitSum(n/10);
    }

}
