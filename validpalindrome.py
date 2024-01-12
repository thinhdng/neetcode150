class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1 = ""
        if (len(s) == 0) or (len(s) == 1):
            return True

        #filter
        for i in range(0, len(s)):
            if s[i].isalnum() == True:
                s1 = s1 + s[i].lower()
            else:
                continue

        left = 0
        right = len(s1) - 1

        for i in range(0, int(len(s1)/2)):
            if s1[left] != s1[right]:
                return False
            else:
                left+=1
                right-=1
        
        return True
        
#2 pointer solution: time complexity = O(n)
