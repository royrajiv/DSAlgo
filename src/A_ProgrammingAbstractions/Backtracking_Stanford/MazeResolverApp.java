package A_ProgrammingAbstractions.Backtracking_Stanford;


public class MazeResolverApp {

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
            for(int i=0; i< 10; i++)
                printAllDecimalHelper(n-1,soFar + i);
        }
    }
}
