class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=TwoSum(nums,target);
        return ans;
    }
    public static int[] TwoSum(int []nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int moreNeeded=target-nums[i];
            if(map.containsKey(moreNeeded)){
                ans[0]=map.get(moreNeeded);
                ans[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    } 
}