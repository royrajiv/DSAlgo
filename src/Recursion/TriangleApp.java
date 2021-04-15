package Recursion;

import java.io.IOException;

public class TriangleApp {

    static int theNumber;

    public static void main(String[] args) throws IOException {
        theNumber = 3; // number can be fetched from user Input.
        System.out.println("Enter a number:               "+theNumber);
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle =                    " + theAnswer);
    } // end main()

    public static int triangle(int n) {
        if (n == 1) {
            System.out.println("Returning                   1");
            return 1;
        } else {
            int temp = n + triangle(n - 1);
            System.out.println("Returning n:                " + n);
            System.out.println("Returning calculated value: " + temp);
            return temp;
        }
    }
}
