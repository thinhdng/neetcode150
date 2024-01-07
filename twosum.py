class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(0, len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]

        return []
    
#brute force method: O(n^2) - same case in java. DO NOT USE!!!
#for brute force in python is 11x slower to run than in java
#better to use a hashmap

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        complement = 0
        numsMap = {}
        for i in range(0, len(nums)):
            complement = target - nums[i]
            if complement in numsMap:
                return [numsMap.get(complement), i]
            numsMap[nums[i]] = i

        return []
    
#solution using hashmap: same time & space complexity as in java, way less runtime
# than brute force.



