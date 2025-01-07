class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        nums.sort()

        for i in range(len(nums)):
            if nums[i]>0:
                return res

            if i>0 and nums[i] == nums[i-1]:
                continue  
            
            left = i + 1
            right = len(nums) - 1

            while right > left:
                sum1 = nums[i] + nums[left] + nums[right]

                if sum1 < 0:
                    left += 1

                elif sum1 > 0:
                    right -= 1

                else:
                    res.append([nums[i], nums[left], nums[right]])
                    while right > left and nums[right] == nums[right-1]:
                        right -= 1
                    while right > left and nums[left] == nums[left+1]:
                        left += 1
                
                    right -= 1
                    left += 1
            
        return res
            
        