class Solution {
    public int rob(int[] nums) {
        int N = nums.length;

        if(N==0){
            return 0;
        }
        if(N==1){
            return nums[0];        
        }

        int[] maxRob = new int[N];

        maxRob[0] = nums[0];
        maxRob[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < N; i++){
            maxRob[i] = Math.max(maxRob[i-1], maxRob[i-2] + nums[i]);
        }

        return maxRob[N-1];
    }
}