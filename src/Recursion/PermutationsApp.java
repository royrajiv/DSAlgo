package Recursion;

public class PermutationsApp {

    private static boolean[] used = new boolean[4];
    private static StringBuilder out = new StringBuilder();
    private static String in="abc";

    public static void main(String[] args) {
        System.out.println("Calculate permutations=");
        permute();
    }

    public static void permute(){
        if ( out.length() == in.length() ){
            System.out.println( out );
            return;
        }
        for ( int i = 0; i < in.length(); ++i ){
            if ( used[i] ) continue;
            out.append( in.charAt(i) );
            used[i] = true;
            permute();
            used[i] = false;
            out.setLength( out.length() - 1 );
        }
    }
}
