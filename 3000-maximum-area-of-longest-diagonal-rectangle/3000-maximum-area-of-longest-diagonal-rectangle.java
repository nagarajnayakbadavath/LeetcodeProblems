class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

     // Longest diagonal sqrt(l*l+w*w)
     double ld=0.0;
     int x=0;
     int y=0;
        for(int i=0;i<dimensions.length;i++){
            double max=Math.sqrt(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]);
            if(max>ld){
                ld=max;
                x=dimensions[i][0];
                y=dimensions[i][1];
            }
        }
        return calculateMaxArea(x,y);
    }
    static int calculateMaxArea(int x,int y){
        return x*y;
    }
}