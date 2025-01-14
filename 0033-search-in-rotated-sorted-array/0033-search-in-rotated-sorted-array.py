class Solution:
    def search(self, nums: List[int], target: int) -> int:
        def is_blue(i:int) -> bool:
            end = nums[-1]
            if nums[i] > end:
                return target > end and nums[i] >= target
            else:
                return target > end or nums[i] >= target
        left = 0
        right = len(nums) - 2
        while left <= right:
            mid = left + (right-left) // 2
            if is_blue(mid): 
                right = mid - 1
            else:
                left = mid + 1
        
        if left == len(nums) or nums[left] != target:
            return -1
            
        return left