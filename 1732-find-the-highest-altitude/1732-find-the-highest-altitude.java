class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int k = 0;
        int max = 0;
        for(int i = 0;i<gain.length;i++){
            int z =gain[i]+k;
            max = Math.max(max,z);
            k = z;

        }
        return max;
        
        
        
    }
}