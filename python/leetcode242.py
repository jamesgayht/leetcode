class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # check if len are the same, else return false
        if len(s) != len(t): return False

        # add all char in t to a dict
        dict_t = {}
        for char in t:
            if char in dict_t:
                dict_t[char] += 1 
            else:
                dict_t[char] = 1 

        for char in s:
            if char in dict_t:
                if dict_t[char] == 0:
                    return False
                dict_t[char] -= 1
            else:
                return False
                
        
        return True