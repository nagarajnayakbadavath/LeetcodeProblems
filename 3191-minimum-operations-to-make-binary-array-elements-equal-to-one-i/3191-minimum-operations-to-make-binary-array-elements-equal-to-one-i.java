class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(nums[i]!=1){
                count++;
                flipArray(nums,i);
            }
        }
        if(nums[n-2]==0 || nums[n-1]==0){
            return -1;
        }
        return count;

    }
    static void flipArray(int nums[],int index){
        nums[index]=1;
        if(nums[index+1]==0){
            nums[index+1]=1;
        }else{
            nums[index+1]=0;
        }
        if(nums[index+2]==0){
            nums[index+2]=1;
        }else{
            nums[index+2]=0;
        }
    }
}