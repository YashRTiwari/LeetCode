package TwoSums;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]
*/


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] twoSum(int[] l, int target) {

        int [] answer =  new int[2];
        List<Integer> list = Arrays.stream(l).boxed().collect(Collectors.toList());

//         for(int i=0; i<list.length; i++){
//             int left = target - list[i];
//             for(int j = 0; j< list.length; j++){

//                     if(list[j] == left && i != j){
//                         answer[0] = i;
//                         answer[1] = j;
//                         break;
//                     }

//             }

//         }

        //Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            int left = target - list.get(i);

            if(list.contains((Integer)left) ){
                if(i != list.indexOf((Integer) left)){
                    answer[0] = i;
                    answer[1] = list.indexOf((Integer) left);
                    break;
                }
            }

        }

        return answer;

    }
}