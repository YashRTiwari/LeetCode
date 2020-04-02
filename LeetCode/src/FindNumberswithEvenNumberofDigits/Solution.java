package FindNumberswithEvenNumberofDigits;

public class Solution {

    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
            int subCount = 0;
            while(n != 0){
                n = n/10;
                subCount++;
            }
            if(subCount%2 == 0)
                count++;
        }
        return count;
    }

}
