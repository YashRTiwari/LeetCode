package LongestCommonPRefix;

import java.util.*;
class Solution {

    static Comparator c = new Comparator<String>(){
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    };

    public static String longestCommonPrefix(String[] strs) {
        Arrays.parallelSort(strs, c);

        if(strs == null)
            return "";
        else if(strs.length == 0)
            return "";

        int firstLength = strs[0].length();

        for (int i = 1; i<strs.length; i++){
            while(firstLength != 0){

                String prefix = strs[0].substring(0, firstLength);
                String str = strs[i].substring(0, firstLength);
                if(!str.equals(prefix)){
                    firstLength--;
                } else {
                    break;
                }
            }
            if(firstLength == 0)
                return "";
        }

        return strs[0].substring(0,firstLength);
    }


}