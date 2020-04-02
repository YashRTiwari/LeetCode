package LC30DayChallenge.day1;

import java.util.HashMap;

class SingleNumber {

    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){

            if (map.containsKey(nums[i])){
                int cV = map.get(nums[i]);
                map.put(nums[i], ++cV);
            } else{
                map.put(nums[i], 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])%2 != 0 )
                return (nums[i]);
        }
        return -1;
    }


}