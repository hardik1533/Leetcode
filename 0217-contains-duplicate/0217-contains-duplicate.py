# class Solution:
#     def containsDuplicate(self, nums: list[int]) -> bool:
#         counts = {}

#         for num in nums:
#             if num in counts:
#                 return True   # duplicate found
#             else:
#                 counts[num] = 1

#         return False

class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        return len(nums) != len(set(nums))

