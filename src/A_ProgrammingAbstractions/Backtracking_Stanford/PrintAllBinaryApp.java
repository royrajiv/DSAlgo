package A_ProgrammingAbstractions.Backtracking_Stanford;

// Given a positive integer number N. The task is to generate all the binary strings of N bits.
// These binary strings should be in ascending order.
// https://www.youtube.com/watch?v=wiBPsaJs2yQ&t=445s
public class PrintAllBinaryApp {

    public static void main(String[] args) {
        System.out.println("Calculate printAllBinary=");
        printAllBinary(2);
    }

    public static void printAllBinary(int n){
        printAllBinaryHelper(n,"");
    }

    public static void printAllBinaryHelper(int n, String output)
    {
        //think of this as inverse recursion where base case says my predecessors
        //have done most of the work : I need to print/complete their work.
        if(n==0)
            System.out.println(output);
        else
        {   // lesson
            // if you want to exhaustively explore a space
            // your function call will often make multiple successor calls
            // 1 for each possible choice it could make.
            // It still has same principle that we are all in it together.
            // each little function call will do a little bit of work.
            // but whats different is that instead of me handing on the one successor
            // call, I make a set of successor function calls. In this case 2, sometimes more.
            // and eventually after the result of all those function calls accumulate
            // I will have built something, all of us together would have built something.
            // That something took the form of the String we were accumulating.
            // and once we have finished building that thing we will display it or do
            // something with it. But then those function calls will proceed to successor
            // function calls and we will end up building lots of different things, we will
            // build all of the possible options, all of the possible combinations
            // that are there.
            // so code like this also kind of inverts what the base case is or what it means
            // we have talked about base case as this is the simple/easy version of problem
            // like 0 or 1 factorial: reverse string : its empty or 1 letter
            // tht's fine tht's kind of what we are doing here
            // but in this case it's less that the problem was easy and the main() asked us
            // to print 0 digits, its not quite that, its more then my predecessor
            // function call asked me to print 0 digits
            // except I need to take all my predecessors work and display it.
            // base case now = culmination/end point of all the calls that came before it
            // as opposed to being the entry point that's easy, that doesnt do any work.

            // this is how the prof thinks about these things and it takes a while to get used to.

            // multiple choices hence multiple recursive calls.
            // "0", "1", at end : my work is adding on to the work done by calls before me
            // I like to think it as : each call adds to the end what came before it.
            // so its their work +  my work.
            // total work gets printed in base case.
            // my work is a 0
            // then my work is a 1
            // adding "0"/"1" before output will still work, it will flip the order.
            printAllBinaryHelper(n-1, output + "0");
            printAllBinaryHelper(n-1, output + "1");
        }
    }
}

/*
Input: 2
Output:
0 0
0 1
1 0
1 1

3 digit all permutations -- consider this as "0" or "1" added before all 2 digit permutations
Input: 3
Output:
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1
 */