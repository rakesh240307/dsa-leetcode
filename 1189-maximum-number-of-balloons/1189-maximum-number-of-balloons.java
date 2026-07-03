class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[5];
        for(int i = 0; i < text.length();i++){
            if(text.charAt(i)== 'b'){
                arr[0]+=2;

            }
            if(text.charAt(i)== 'a'){
                arr[1]+=2;

            }
            if(text.charAt(i)== 'l'){
                arr[2]+=1;

            }
            if(text.charAt(i)== 'o'){
                arr[3]+=1;

            }
            if(text.charAt(i)== 'n'){
                arr[4]+=2;

            }
        }
        int k = 999999999;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<k){
                k=arr[i];
            }
        }
        if(k==1){
            return 0;

        }
        else{
            return k/2;
        }
        
        
    }
}