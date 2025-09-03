class Solution {
    public int minimizeArrayValue(int[] nums) {
        

        long prefixSum=0;
        int result=0;

        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int avg=(int) Math.ceil((double)prefixSum/(i+1));
            result=Math.max(result,avg);
        }
        return result;
    }
}