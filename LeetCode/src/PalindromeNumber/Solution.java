package PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        if(x <0)
            return false;
        java.util.ArrayList<Integer> nums = new java.util.ArrayList<>();

        while(x != 0){
            int unitPlace = x%10;
            x = x/10;
            nums.add(unitPlace);
        }

        for (int i =0; i<nums.size()/2; i++){
            if(nums.get(i) != nums.get(nums.size() - 1  - i))
                return false;
        }

        return true;
    }

}