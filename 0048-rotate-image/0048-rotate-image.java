class Solution {
    public void rotate(int[][] matrix) {



        // first transpose the matrix and then reverse the array 1d on each row

        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        int i=0;

        while(i<matrix.length){
            int j=0;
            int k=matrix.length-1;
            while(j<k){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
            }
            i++;
        }
    }
}