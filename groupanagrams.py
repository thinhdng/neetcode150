class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram = {}
        for word in strs:
            temp_word = ''.join(sorted(word))

            if temp_word in anagram:
                anagram[temp_word].append(word)

            else:
                anagram[temp_word] = [word]
            
        return list(anagram.values())
# group anagrams using hashmap to store the sorted
# version of each word as keys: O(N * K * log K), where N is the number of words in strs, 
# and K is the maximum length of a word. 
# This complexity arises due to the sorting of characters in each word.    

