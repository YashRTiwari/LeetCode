package ReverseInteger;

import java.util.ArrayList;

public class ReverseInteger {


    public int reverseSolution(int x) {
        double reversedNumber = 0;

        int length = String.valueOf(Math.abs(x)).length() - 1;

        while(x != 0){
            int unitPlace = x%10;
            x = x/10;
            reversedNumber = unitPlace * Math.pow(10, length--) + reversedNumber;
        }


        if(reversedNumber >= Integer.MAX_VALUE || reversedNumber <= Integer.MIN_VALUE)
            reversedNumber = 0;
        return (int) reversedNumber;
    }


    public int reverse(int x) {
        double reversedNumber = 0;
        String temp = String.valueOf(x);
        int length = temp.length() - 1;

        while(x != 0){
            int unitPlace = x%10;
            x = x/10;
            reversedNumber = unitPlace * Math.pow(10, --length) + reversedNumber;
        }


        if(reversedNumber >= Integer.MAX_VALUE || reversedNumber <= Integer.MIN_VALUE)
            reversedNumber = 0;
        return (int) reversedNumber;
    }


    public int reverse2(int x) {
        int temp = x;
        ArrayList<Integer> nums = new ArrayList<>();

        while(temp != 0){
            int unitPlace = temp%10;
            temp = temp/10;
            nums.add(unitPlace);
        }
        double reversedNumber = 0;
        int index = nums.size() - 1;
        for(int number : nums){
            reversedNumber = number * Math.pow(10, index) + reversedNumber;
            index--;
        }

        if(reversedNumber >= Integer.MAX_VALUE)
            reversedNumber = 0;
        return (int) reversedNumber;
    }

}
