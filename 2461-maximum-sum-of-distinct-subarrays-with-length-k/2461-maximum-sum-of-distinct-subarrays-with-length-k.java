class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        long sum=0;
        int right=0;
        int left=0;
        long max=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<nums.length){
            sum+=nums[right];
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            // if duplicate occured or size is > than k
            while(map.get(nums[right])>1 || right-left+1>k){
                sum-=nums[left];
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            // if size == k find the max

            if(right-left+1==k){
                max=Math.max(sum,max);
            }
            right++;
        }
        return max;
    }
}