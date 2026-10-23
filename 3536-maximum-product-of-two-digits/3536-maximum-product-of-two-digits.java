class Solution {
    public int maxProduct(int n) {
        int num = n;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        while(num>0){
            int val = num%10;
            if(val>=max){
                max2 = max;
                max= val;
            }
            else if(val<max && val>max2){
                max2 = val;
            }
            num = num/10;

        }
        return max*max2;
        
    }
}