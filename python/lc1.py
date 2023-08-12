class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # iterate through the array using index
        n = len(nums)
        for i in range(n): 
            required = target - nums[i]
            # for each num, check if a pair exist
            # if exists, check if the index is different
            if(required in nums and nums.index(required) != i):
                return [i, nums.index(required)]

# faster way using hashset
