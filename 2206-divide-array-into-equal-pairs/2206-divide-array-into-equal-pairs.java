class Solution {
    public boolean divideArray(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int count=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            Integer value=entry.getValue();
            if(value%2!=0){
                return false;
            }
        }
        return true;
    }
}