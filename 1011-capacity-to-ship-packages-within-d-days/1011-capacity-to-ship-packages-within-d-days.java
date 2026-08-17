class Solution {
    public int max(int[] weights){
        int a = Integer.MIN_VALUE;

        for(int i = 0 ; i<weights.length;i++){
            if(weights[i]>a){
                a = weights[i];
            }

        }
        return a;
    }
    public int num(int[] weights, int k) {
    int sum = 0;
    int count = 1;  

    for (int i = 0; i < weights.length; i++) {
        if (sum + weights[i] > k) {
            count++;
            sum = 0;
        }

        sum += weights[i];
    }

    return count;
}
   
    public int sum(int[] weights){
        int sum = 0 ; 
        for(int i =0 ;  i<weights.length;i++){
            sum += weights[i];

        }
        return sum ; 
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = max(weights);
        int right = sum(weights);
        int ans = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(num(weights,mid)<=days){
                right = mid -1;
                ans = mid;
            }
            else{
                left = mid +1;
            }
        }
        return ans;
        

    }
}
