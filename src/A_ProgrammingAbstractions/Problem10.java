package A_ProgrammingAbstractions;

/*
    The strutils.h library contains a function IntegerToString,. You might have
    wondered how the computer actually goes about the process of converting an integer
    into its string representation. As it turns out, the easiest way to implement this
    function is to use the recursive decomposition of an integer outlined in exercise 6.
    Rewrite the IntegerToString implementation so that it operates recursively without
    using use any of the iterative constructs such as while and for.

https://web.stanford.edu/class/archive/cs/cs106b/cs106b.1084/materials/doxygen_headers/strutils_8h.html#b04420825e306d7cf3226de3acd0d130

    string IntegerToString	(	int 	num	 )
    This function converts an integer into the corresponding string of digits.
    For example, IntegerToString(123) returns "123" as a string.
*/
public class Problem10 {

    public static void main(String[] args) {
        System.out.println("Total 1729 =" + intToStr(1729));
    }

    private static String intToStr(int n) {
        if(n <10)
            return ""+n;
        return intToStr(n/10) + n%10;
    }

}
