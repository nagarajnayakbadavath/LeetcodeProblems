class Solution {
    public int minOperations(int[][] grid, int x) {
        int row=grid.length;
        int col=grid[0].length;
        int newArray[]=new int[row*col];
        int remainder=grid[0][0]%x;
        int index=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]%x==remainder){
                    newArray[index++]=grid[i][j];
                }else{
                    return -1;
                }
            }
        }
        Arrays.sort(newArray);
        int median=newArray.length/2;
        int steps=0;
        for(int i=0;i<newArray.length;i++){
            steps+=(Math.abs(newArray[i]-newArray[median]))/x;
        }
        return steps;
    }
}