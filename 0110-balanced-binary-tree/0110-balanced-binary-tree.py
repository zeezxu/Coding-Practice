# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def getHeight(node):
            if node is None:
                return 0
            left_h = getHeight(node.left)
            if left_h == -1:
                return -1
            right_h = getHeight(node.right)
            if right_h == -1 or abs(left_h - right_h) > 1:
                return -1
            return max(left_h, right_h) + 1
        return getHeight(root) != -1