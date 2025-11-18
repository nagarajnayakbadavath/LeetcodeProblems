class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);

        // for(int i=1;i<nums.length;i++){
        //     if(nums[i-1]==nums[i]){
        //         return true;
        //     }
        // }
        // return false;

        // After sorting the array the time complexity is o n(log n)

        // optimal then that is O(n)
        // we can use the HashSet which stores only the unique integer values

        // Hashset<Integer> set=new HashSet<>();
        // for(int i:nums){
        //     set.add(i);
        // }
        // return set.size()==nums.length?true:false;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                return true;
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return false;
    }
}