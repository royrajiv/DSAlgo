package A_ProgrammingAbstractions;

/*
    Write a recursive function that takes a string as argument and returns the reverse of
    that string. The prototype for this function should be string Reverse(string str);

    input = program
    output = margorp
*/
public class Problem9 {

    public static void main(String[] args) {
        System.out.println("Output =" + reverseString("program"));
    }

    private static String reverseString(String str) {
        char[] charArr = str.toCharArray();
        charArr = reverseRec(charArr,0,str.length()-1);
        return new String(charArr);
    }

    private static char[] reverseRec(char[] str, int start, int end)
    {
        if(start >=end)
            return str;
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        return reverseRec(str,start+1,end-1);
    }
}
