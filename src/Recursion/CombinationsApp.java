package Recursion;

public class CombinationsApp {

    private static StringBuilder out = new StringBuilder();
    private static String in = "abc";

    public static void main(String[] args) {
        System.out.println("Calculate combinations=");
        combine();
    }

    public static void combine() {
        combine(0);
    }

    private static void combine(int start) {
        for (int i = start; i < in.length(); ++i) {
            out.append(in.charAt(i));
            System.out.println(out);
            if (i < in.length())
                combine(i + 1);
            out.setLength(out.length() - 1);
        }
    }
}
/*
main method : "abc"
frame 1: combine(0) -> i=0 -> out = a
frame 2: combine(1) -> i=1 -> out = ab
frame 3: combine(2) -> i=2 -> out = abc
frame 4: combine(3) -> i=3 !< 3 -> out = abc
frame 3: combine(2) -> i=2 -> out = ab -> i++ = 3 !< 3 -> return;
frame 2: combine(1) -> i=1 -> out = a -> i++ = 2 -> out = ac
frame 3: combine(3) -> i=3 !< 3 -> out = ac
frame 2: combine(2) -> i=2 ->

 */