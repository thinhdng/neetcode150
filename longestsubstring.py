class Solution:
    def lengthOfLongestSubstring(s: str):
        charSet = set()
        left = 0
        length = 0
        
        for right in range(len(s)):
            while s[right] in charSet:
                charSet.remove(s[left])
                left+=1
            charSet.add(s[right])
            length = max(length, right - left + 1)
            
        return length

#O(n) space and time
