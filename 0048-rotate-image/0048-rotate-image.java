class Solution {
    static void reverse(int[]arr){
        int i = 0 ;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0 ; i<n-1;i++){
            for(int j = i+1;j<m;j++){
                int temp = matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for(int i = 0;i<n;i++){
            reverse(matrix[i]);

        }
        
    }
}