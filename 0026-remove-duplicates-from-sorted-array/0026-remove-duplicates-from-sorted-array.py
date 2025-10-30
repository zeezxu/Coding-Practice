class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l = 0 # 计算下标
        r = 1 # 探路下标

        while r < len(nums):
            if nums[l] == nums[r]:
                r = r+1
            else:
                l = l + 1
                nums[l] = nums[r] # 把nums[r]赋值给nums[l]
            
        return l + 1 #返回【计算下标+1】
        