import LC30DayChallenge.day3.MaximumSubarray;
import LC30DayChallenge.day4.MoveZeroes;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(calculateSolutionForMaximumSubarray());
        moveZores();
    }

    private static int calculateSolutionForMaximumSubarray(){
        int [] array = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray maximumSubarraySolution = new MaximumSubarray();
        return maximumSubarraySolution.getSolution(array);
    }

    private static int [] moveZores(){
        int [] array = {0,1,0,3,12};
        MoveZeroes maximumSubarraySolution = new MoveZeroes();
        return maximumSubarraySolution.moveZeroes3(array);
    }
}
