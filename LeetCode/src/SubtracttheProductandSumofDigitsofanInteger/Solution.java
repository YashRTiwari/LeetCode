package SubtracttheProductandSumofDigitsofanInteger;

public class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int product = 1;
        while(n !=0){
            int unit = n%10;
            sum += unit;
            product *= unit;
            n=n/10;
        }
        return product - sum;
    }
}
