package LC30DayChallenge.day4;

public class MoveZeroes {

    public int [] moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int j =i;
                while (j - 1 >= 0 && nums[j - 1] == 0) {
                    int temp = nums[j];
                    nums[j - 1] = nums[j];
                    nums[j] = 0;
                    j--;
                }
            }

        }

        return nums;
    }

    public int [] moveZeroes2(int[] nums) {

        boolean [] pos = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
               pos[i] = true;
            }
        }

        int position = 0;
        for (int i = 0; i < pos.length; i++) {
            if (pos[i]){
                nums[position] = nums[i];
                if (position != i) nums[i] = 0;
                position++;
            }
        }

        return nums;
    }

    /*Optimal : Two- pointer appraoch O(N)*/
    public int [] moveZeroes3(int[] nums) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[position] = nums[i];
                if (position != i) nums[i] = 0;
                position++;
            }
        }
        return nums;
    }

}
