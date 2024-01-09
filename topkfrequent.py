class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        numsMap = {}
        freq = []
        count = 1
        for i in nums:
            if i in numsMap:
                numsMap[i] += 1
            else:
                numsMap[i] = 1

        sorted_numsMap = sorted(numsMap, key=numsMap.get, reverse=True)
        return sorted_numsMap[:k]

#pretty much same solution as using java: create a hashmap, store the nums and frequencies pairs, 
#then return the list of most frequent keys by sorting it first by frequencies and return the k numbers of highest frequency numbers
#time complexity: O(nlgn) for sorting the list