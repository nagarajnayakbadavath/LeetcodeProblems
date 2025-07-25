class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);

        int max=-100;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        if(max<=0){
            return max;
        }
    
        int sum=0;
        if(nums[0]>0){
            sum=sum+nums[0];
        }
        // System.out.println(sum);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>0 && nums[i-1]!=nums[i]){
                sum=sum+nums[i];
                // System.out.println(sum);
            } 
        }
        return sum;
    }
}