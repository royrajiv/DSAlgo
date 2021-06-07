package A_ProgrammingAbstractions.Backtracking_Stanford;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Problem: Permute a List of Strings/Characters

Self similarity:
Pick the first element "a", print that, followed by permutations of the other 3 values.
Permuting 4 elements is picking one and permuting the other three.
That's exactly the self-similarity.

Core of the idea : is to turn above logic into java code.

@TODO Question 1 > what is the base case ?

            whats the vector(input parameter from problem statement) that is easy to permute ?
            empty vector ? ok ?
            at some-point of time we are going to run out of elements, so maybe thats the way
            this algorithm works.

@TODO Now, when you write a BackTracking algorithm: you usually create helper function,

        and usually pass extra parameters to help you.
        Usually the reason for thos extra parameters is to keep track of choices that you have
        been making.
        But, we didnt need an extra parameter for maze explorer problem.
        where are we remembering the choices that we are making in maze problem?
        That maze object is storing that for us.
        And because of that we dont need to make another structure to remember choices.

        "soFar" object parameter to keep track of out choices.
        method output as per problem statement shd be a Collection of letters.
        so, choose Vector/List as "chosen" object.
 */
public class PermuteListApp {

    public static void main(String[] args) {
        System.out.println("Calculate permutations=");
        List<String> permuteList = Arrays.asList("a","b","c","d");
        boolean[] visited = new boolean[permuteList.size()];
        permute(permuteList, visited);

    }

    public static void permute(List<String> permuteList,boolean[] visited ){
        permuteHelper(permuteList,visited, new ArrayList<>());
    }

    // to avoid duplicates add a Set and print only if the set doesnt contain that permutation.
    public static void permuteHelper(List<String> permuteList,boolean[] visited, List<String> soFar){
        if(soFar.size() == permuteList.size())
        {
            System.out.println(soFar);
            return;
        }

        //do you see the pattern here, I think it is little hard to read at first
        //but this is the idea
        //pick an element, choose it
        //explore what can happen next
        //come back and put it back, un-choose it
        for(int i=0; i< permuteList.size(); i++)
        {
            //for each choice, in this case I need to choose each letter as starting letter of the permutation.
            //assume I am the first call, no choices have been made, I hve got a,b,c,d
            //I can choose any of them, which one shd I choose ?
            //I shd choose "a" and try that, I shd choose "b" and try tht, I shd choose "c"...
            //I shd choose all of them because there are no bad outcomes, its not that I am
            //going to get to a bad state and withdraw from it or whtever, but I need to try all of them
            //as being first, then I need to try all of them as being second, so

            //@TODO for each choice i.e. each element in the Vector/List, perform below 3 backtracking steps:

            //choose -- means add to chosen list/output
            if(visited[i])
                continue;
            soFar.add(permuteList.get(i));
            visited[i] = true;
            //explore
            permuteHelper(permuteList,visited,soFar);
            //unchoose (often un-choose is the mirror code of choose)
            visited[i] = false;
            soFar.remove(soFar.size()-1);

            //@TODO un-choose is not clear to lot of students
            //so to explain: keep in mind that permuteHelper() is going to lead to a tree of things
            //if I am first call and I make another call that's gonna lead to lots and lots
            //of calls under that, eventually all those subcalls are going to come-back
            //and what that means is I have now finished processing or printing
            //everythign that could possibly have started with the letter "a" or the element "i"
            //or whatever, so once I am done I need to unchoose the letter "a" and then
            //advance and try the letter "b" or try the letter "c" or whichever one is next
        }
    }

}
