class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        # result_dict = {}
        # n = len(nums)
        # for i in range(2*n):
        #     if(i >= n):
        #         result_dict[i] = nums[i-n]
        #     else:
        #         result_dict[i] = nums[i]

        # return result_dict.values()

        # hacky way
        return nums * 2
