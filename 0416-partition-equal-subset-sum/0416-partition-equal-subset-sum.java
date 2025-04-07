class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        sum=sum/2;
        int target=sum;
        return findTarget(nums.length-1,nums,target);
    }
    static boolean findTarget(int index,int nums[],int target){
        //Base case
        if(target==0) return true;
        if(index<0) return false;

        boolean pick=false;
        boolean notPick;
        if(nums[index]<=target){
            pick=findTarget(index-1,nums,target-nums[index]);
        }
        notPick=findTarget(index-1,nums,target);
        return pick || notPick;
    }
}