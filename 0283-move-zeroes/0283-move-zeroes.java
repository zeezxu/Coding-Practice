class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            System.out.print(nums);
        }
        else{
            int s = 0;
            
            for(int f = 1; f < nums.length; f++){
                if(nums[s] == 0 && nums[f] != 0){
                    int temp = nums[s];
                    nums[s] = nums[f];
                    nums[f] = temp;
                    s++;
                }
                else if(nums[s] != 0){
                    s++;
                }
            }
            System.out.print(nums);
        }
    }
}