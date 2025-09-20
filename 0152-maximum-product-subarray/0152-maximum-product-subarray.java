class Solution {
    public int maxProduct(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int temp=1;
            for(int j=i;j<nums.length;j++){
                temp*=nums[j];
                ans=Math.max(ans,temp);
            }
        }
        return ans;
    }
}