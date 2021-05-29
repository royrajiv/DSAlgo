package A_ProgAbs;

/*
 Write a recursive function DigitSum(n) that takes a nonnegative integer and returns
 the sum of its digits. For example, calling DigitSum(1729) should return
 1 + 7 + 2 + 9, which is 19.
 The recursive implementation of DigitSum depends on the fact that it is very easy
 to break an integer down into two components using division by 10. For example,
 given the integer 1729, you can divide it into two pieces as follows:
    1729
    n / 10 => 172 -> 17 -> 1 (base case n< 10 return n)
    n % 10 => 9
 Each of the resulting integers is strictly smaller than the original and thus represents
 a simpler case.
 */
public class Problem6 {

    public static void main(String[] args) {
        System.out.println("Total 1729 =" + digitSum(1729));
        System.out.println("Total 123 =" + digitSum(123));
        System.out.println("Total 1 =" + digitSum(1));
    }

    private static int digitSum(int n) {
        if(n <10)
            return n;
        return n%10 + digitSum(n/10);
    }
}
