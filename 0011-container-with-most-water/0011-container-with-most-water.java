class Solution {
    public int maxArea(int[] height) {
        // //Brute force

        // int maxVal=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int vol=Math.min(height[i],height[j])*(j-i);
        //         if(vol>maxVal){
        //             maxVal=vol;
        //         }
        //     }
        // }
        // return maxVal;

        //optimal

        int maxVol=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int vol=Math.min(height[left],height[right])*(right-left);
            maxVol=Math.max(maxVol,vol);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxVol;
    }
}