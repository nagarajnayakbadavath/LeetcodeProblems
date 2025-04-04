class Solution {
    public long maximumTripletValue(int[] nums) {
        /* I have written the brute force codes as well of o(n^3) and O(n^2)  and Here I am pasting those solutions as well */

        //Let me first complete the code
        int leftMax=nums[0];
        int rightMax=nums[nums.length-1];
        long maxValue=0;

        int[] rightMaxArr = new int[nums.length];
        rightMaxArr[nums.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            rightMaxArr[i] = Math.max(rightMaxArr[i + 1], nums[i]);
        }

        for (int i = 1; i < nums.length - 1; i++) {
    leftMax = Math.max(leftMax, nums[i - 1]); // Update left max
    rightMax = rightMaxArr[i + 1]; // Get precomputed right max
    maxValue = Math.max(maxValue, (long) (leftMax - nums[i]) * rightMax);
}
        return maxValue;
    }
}