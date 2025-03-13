class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> list = new ArrayList<>();
        int low = lower;

        for(int curr:nums){
            if(curr > low){
                list.add(Arrays.asList(low,curr - 1));
                low = curr + 1;
            }
            else{
                low = curr + 1;
            }
        }
        if (upper >= low){
            list.add(Arrays.asList(low, upper));
        }
        return list;
    }
}