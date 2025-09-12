class Solution {
    public int findGCD(int[] nums) {

        int x=Integer.MIN_VALUE;
        int y=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>x){
                x=nums[i];
            }
            if(nums[i]<y){
                y=nums[i];
            }
        }

        int result=-1;
        while(true){
            int ans=x%y;
            if(ans==0){
                result=y;
                break;
            }
            x=y;
            y=ans;
        }
        return result;
    }
}