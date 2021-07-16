package A_ProgrammingAbstractions.Backtracking_Stanford;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Print all different subsets of a List i.e. print PowerSet.
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Refer to permutations code: For each choice(Choose -> Explore -> Unchoose)
Now, we are writing a back-tracking algorithm.
Steps:
1> Helper function
2> Figure out what I am choosing : In this case : choose elements from the vector(input)
3> Keep track of all things chosen : Hence, need another vector to put things in.

Possible pseudo-code
 helperFunction(inputList <a,b,c>, chosenList)
 {
    if(inputList is empty)
        //base case
    else
        //recursive case
        // for each possible choice
            i.e for each element (for(int i=0; i< inputList.size(); i++))
                    choice = inputList.get(i);
        //  - choose
            In this case we want to explore all things including element "a"
            and, explore all things excluding element "a"
            Hence, each call should decide to include or exclude.
            that yes or no choice is the responsibility of each function call.

            So: each function call says:
                I dont know how to handle sublists, but I will decide whether "a" is in or out.
                Next function call says, I dont know how to handle sublists, but I will decide whether "b" is in or out.

         {a,b,c,d}
            If I am the first call my job is to process "a"
            If I am the second call my job is to process "b"
        //  - explore
        //  - un-choose
 }

backtracking problems sometimes it is difficult to figure out.
what the choices are, what is the unit of work each function call will take care of.
 */
public class SubsetsApp {

    public static void main(String[] args) {
        System.out.println("Calculate subsets=");
        int[] nums = {1, 2, 3};
        generateSubsets(nums);

    }

    public static void generateSubsets(int[] nums) {

        subsetsHelper(0, nums, new ArrayList<>());
    }

    public static void subsetsHelper(int start, int[] nums, List<Integer> soFar) {
        System.out.println(soFar);
        //recursive case
        //for each possible choide
        for (int i = start; i < nums.length; ++i) {
            soFar.add(nums[i]);  //choose  (try with "a", try without "a")
            subsetsHelper(i + 1, nums, soFar);  //explore
            soFar.remove(soFar.size() - 1);    //un-choose
        }
    }

}
