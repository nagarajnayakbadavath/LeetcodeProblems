class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long sum=0;
        long maxSum=0;

        int r=0;
        int l=0;

        while(r<nums.length){
            if(r-l+1<=k){
                map.put(nums[r],map.getOrDefault(nums[r],0)+1);
                sum+=nums[r];
                r++;
            }else{
                if(map.size()==k){
                    maxSum=Math.max(sum,maxSum);
                }
                sum-=nums[l];
                int val=map.get(nums[l])-1;
                if(val==0){
                    map.remove(nums[l]);
                }else{
                    map.put(nums[l],val);
                }
                l++;
            }
            if(map.size()==k){
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
}