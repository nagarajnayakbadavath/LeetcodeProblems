class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // We are gonna have a HashMap over here

        HashMap<Integer,Integer> map=new HashMap<>();

        int l=0;
        int r=0;
        int sum=0;
        int max=0;

        while(r<nums.length){
            if(!map.containsKey(nums[r])){
                map.put(nums[r],r);
                sum+=nums[r];
                max=Math.max(sum,max);
            }else{
                while(l<=map.get(nums[r])){
                    sum-=nums[l];
                    l++;
                }
                sum+=nums[r];
                max=Math.max(max,sum);
            }
            map.put(nums[r],r);
            r++;
        }
        return max;
    }
}