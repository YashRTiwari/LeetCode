package JewelsAndStone;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        char [] s = S.toCharArray();
        //char [] j = J.toCharArray();
        int count = 0;
        for(char x : s){
            if(J.indexOf(x) != -1)
                count++;
        }
        // for(char y : j){
        //     int firstO = S.indexOf(y);
        //     while(firstO != -1){
        //         count++;
        //         firstO = S.indexOf(y, firstO+1);
        //     }
        // }
        // int length = S.length();
        // for(char y :j){
        //     count = count + length - S.replace(y+"","").length();
        // }
        return count;
    }
}
