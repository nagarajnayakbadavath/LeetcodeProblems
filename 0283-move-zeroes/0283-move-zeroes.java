class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int temp[]=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp[index++]=nums[i];
            }
        }
        for(int i=index;i<nums.length;i++){
            temp[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}