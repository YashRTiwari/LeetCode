import LC30DayChallenge.day3.MaximumSubarray;

public class Solution {

    public static void main(String[] args) {
        System.out.println(calculateSolutionForMaximumSubarray());
    }



    private static int calculateSolutionForMaximumSubarray(){
        int [] array = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray maximumSubarraySolution = new MaximumSubarray();
        return maximumSubarraySolution.getSolution(array);
    }

}
