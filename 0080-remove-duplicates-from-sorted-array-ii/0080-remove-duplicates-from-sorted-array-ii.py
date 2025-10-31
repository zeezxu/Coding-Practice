class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        c = 0
        l = 0
        r = 0
        while r < len(nums) - 1:
            if nums[r] == nums[r+1]:
                c = c + 1
                if c < 2:
                    nums[l] = nums[r]
                    r = r + 1
                    l = l + 1
                else:
                    r = r + 1
            else:
                c = 0
                nums[l] = nums[r]
                r = r + 1
                l = l + 1
        nums[l] = nums[r]
        l = l + 1

        return l
        