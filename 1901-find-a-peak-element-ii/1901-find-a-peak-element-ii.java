class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = - 1;
        int a = 0;
        int b = 0 ;
        for(int i = 0; i<mat.length;i++){
            for(int j = 0 ; j<mat[i].length;j++){
                if(mat[i][j]>max){
                    max = mat[i][j];
                    a = i; 
                    b = j ;

                }

            }
        }
        return new int[]{a,b};
        
    }
}