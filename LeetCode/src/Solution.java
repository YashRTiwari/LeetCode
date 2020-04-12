import LC30DayChallenge.day10.MinStack;
import LC30DayChallenge.day3.MaximumSubarray;
import LC30DayChallenge.day4.MoveZeroes;
import LC30DayChallenge.day5.BestTimetoBuyandSellStock;
import LC30DayChallenge.day6.GroupAnagram;
import LC30DayChallenge.day7.CountElements;
import LC30DayChallenge.day9.BackspaceStringCompare;
import validnumber.ValidNumber;

public class Solution {

    public static void main(String[] args) {

        minStack();
//        System.out.println(countElements());
//        System.out.println(calculateSolutionForMaximumSubarray());
//        moveZores();
//        System.out.println(Math.pow(10, 0.1));
//        System.out.println(validNumbers());
//        System.out.println(bestTimetoBuyandSellStock());
    }

    private static void minStack() {
        MinStack obj = new MinStack();
        obj.push(2);
        obj.push(0);
        obj.push(3);
        obj.push(0);
        obj.getMin();
        obj.pop();
        obj.getMin();
        obj.pop();
        obj.getMin();
        obj.pop();
        obj.getMin();


    }

    private static boolean backspaaceStringCompare() {
        return new BackspaceStringCompare().backspaceCompare("a#cde#", "#k##cdk#r#");

    }

    private static int countElements() {
        int[] array = {1, 1, 2, 2};
        CountElements countElements = new CountElements();
        return countElements.countElements(array);
    }

    private static int calculateSolutionForMaximumSubarray() {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubarray maximumSubarraySolution = new MaximumSubarray();
        return maximumSubarraySolution.getSolution(array);
    }

    private static int[] moveZores() {
        int[] array = {0, 1, 0, 3, 12};
        MoveZeroes maximumSubarraySolution = new MoveZeroes();
        return maximumSubarraySolution.moveZeroes3(array);
    }

    private static int bestTimetoBuyandSellStock() {
        int[] array = {7, 1, 5, 3, 6, 4};
//        int [] array = {1,2,3,4,5};
//        int [] array = {6,1,3,2,4,7};
        return new BestTimetoBuyandSellStock().maxProfit(array);

    }

    private static void groupAnagram() {
        String[] values = {"paw", "dad", "bog", "day", "day", "mig", "len", "rat"};
        GroupAnagram anagram = new GroupAnagram();
        anagram.groupAnagrams(values);
    }
}
