class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[101];

        for(int i = 0 ; i< nums.length ; i++){
            arr[nums[i]]++;
        }
        int max = 0 ;
        for(int i = 0 ; i< 101;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        for(int i = 1 ; i<=max;i++){
            for(int j = 0 ; j<101;j++){
                if(arr[j]>0){
                    list.add(j);
                    arr[j]--;
                }
            }
        }
        int[] neww = new int[list.size()];
        for(int i = 0 ; i<list.size();i++){
            neww[i]=list.get(i);
        }
        return neww;
        
    }
}