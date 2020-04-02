package UNSOLVED_ValidParentheses;

public class Solution {

    public  static void main(String []args){
        char [] a = "YASHTiwari".toCharArray();

        for(int i=0;i <a.length; i++) {
            if(a[i] == 'Y'){
                a[i] = 'P';
            }
        }

        System.out.println(a);
    }

}
