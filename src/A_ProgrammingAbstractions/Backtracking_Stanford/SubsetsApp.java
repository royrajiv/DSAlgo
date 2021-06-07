package A_ProgrammingAbstractions.Backtracking_Stanford;

import java.util.ArrayList;
import java.util.List;

public class SubsetsApp {

    public static void main(String[] args) {
        System.out.println("Calculate subsets=");
        int[] nums = {1,2};
        generateSubsets(nums);
    }

    public static void generateSubsets(int[] nums) {
        subsetsHelper(0, nums,new ArrayList<>());
    }

    public static void subsetsHelper(int start, int[] nums, List<Integer> soFar) {
        System.out.println(soFar);
        for(int i=start; i< nums.length; ++i)
        {
            soFar.add(nums[i]);
            subsetsHelper(i+1, nums, soFar);
            soFar.remove(soFar.size()-1);
        }
    }
}
