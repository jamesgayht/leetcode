class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        # n = len(arr)
        # highest = 0
        # result = []
        # for i in reversed(range(n)): 

        #     if i == n-1: 
        #         highest = arr[i]
        #         result.append(-1)
        #         continue
            
        #     result.insert(0, highest)

        #     if arr[i] > highest: 
        #         highest = arr[i]

        # return result
    
# faster solution
        rev, maximum = arr[::-1], -1
        for i in range(len(rev)):
            rev[i], maximum = maximum, max(rev[i], maximum)

        return rev[::-1]
