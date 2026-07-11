class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean z = false;
        int nn= flowerbed.length;
        int count = 0;
        int left ;
        int right;


        for(int i = 0 ; i<nn;i++){
            if(i == 0){
                left = 0;
            }
            else {
                left = flowerbed[i-1];
            }
            if(i==nn-1){
                right = 0;

            }
            else{
                right = flowerbed[i+1];
            }
            if( left ==0 && flowerbed[i]==0 && right==0){
                count++;
                flowerbed[i]=1;
            }
        }
        if(count>=n){
            return true;
        }
        return z;
    }
}