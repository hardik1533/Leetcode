class Solution:
    def firstUniqChar(self, s: str) -> int:
        dict = {}

        for char in s:
            if char in dict:
                dict[char] += 1
            else:
                dict[char] = 1

        for i in range(len(s)):
            if dict[s[i]] == 1:
                return i
            
        return -1
        