package create_target_array_in_the_given_order;

public class Solution {

    public static void main(String[] args) {
        int [] nums = new int[]{0,1,2,3,4};
        int [] index = new int[]{0,1,2,2,1};
        System.out.println(createTargetArray(nums, index));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {

        int [] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int position = index[i];
            for (int j=i; j> position && j > 0; j--){
                result[j] = result[j-1];
            }
            result[position] = nums[i];
        }

        return result;
    }

}
