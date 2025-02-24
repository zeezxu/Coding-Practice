class Solution {
    public int maxSubArray(int[] nums) {
        int currSub = nums[0];
        int maxSub = nums[0];

        for(int i = 1; i < nums.length; i++){
            int num = nums[i];

            currSub = Math.max(num, currSub+num);
            maxSub = Math.max(maxSub, currSub);
        }

        return maxSub;
    }
}