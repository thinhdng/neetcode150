class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low = 0 #low pointer 
        high = len(nums) - 1 #high pointer
        mid = 0
        while low <= high:
            mid = low + (high - low)//2
            if target == nums[mid]:
                return mid        
            elif target < nums[mid]: #if target is smaller than current mid
                high = mid - 1
            else: #if target is bigger than current mid
                low = mid + 1
        return -1 #if target is not in array