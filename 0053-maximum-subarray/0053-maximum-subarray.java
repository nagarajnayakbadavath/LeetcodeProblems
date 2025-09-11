class Solution {
    public int maxSubArray(int[] nums) {
        

        int i=0;

        int sum=0;
        int max=-1;
        
        int max2=nums[0];
        int count=0;
        for(int val:nums){
            if(val<0){
                count++;
                max2=Math.max(max2,val);
            }
        }
        if(count==nums.length){
            return max2;
        }

        while(i<nums.length){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
            i++;
        }
        return max;
    }
}