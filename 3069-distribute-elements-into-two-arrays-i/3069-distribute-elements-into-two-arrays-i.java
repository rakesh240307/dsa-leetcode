class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        for(int i = 2; i<nums.length;i++){
            if(a.get(a.size()-1)>b.get(b.size()-1)){
                a.add(nums[i]);
            }
            else{
                b.add(nums[i]);
            }
        }
        int count = 0;
        int[] arr = new int[a.size()+b.size()];
        for(int i = 0 ; i<a.size();i++){
            arr[count]=a.get(i);
            count++;
        }
         for(int i = 0 ; i<b.size();i++){
            arr[count]=b.get(i);
            count++;
        }
        




        return arr;


        
    }
}