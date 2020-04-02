package LC30DayChallenge.day2;

import java.util.HashSet;

/*
* Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*
* */

public class HappyNumber {


    public static void main(String[] args) {

        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {

        int original = n;
        if (n == 1) return true;
//        if(n/10 == 0) return false;
        HashSet<Integer> counted = new HashSet<>();
        while (n != 1) {
            System.out.println(n);
            if (counted.contains(n))
                return false;
            else
                counted.add(n);
            n = getMeOne(n);
        }

        return true;
    }

    private static int getMeOne(int x) {
        int sum = 0;
        while (x != 0) {
            int unitPlace = x % 10;
            x = x / 10;
//            System.out.println("    " + unitPlace);
            sum += unitPlace * unitPlace;
//            System.out.println("        " + sum);

        }

        return sum;
    }

}
