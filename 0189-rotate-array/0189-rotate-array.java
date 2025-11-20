class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==0) return ;

        int n=nums.length;
        int temp[]=new int[n];
        
        int index=0;
        for(int i=n-k;i<nums.length;i++){
            temp[index++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            temp[index++]=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}