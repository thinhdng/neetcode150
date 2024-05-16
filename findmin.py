class Solution:
    def findMin(self, nums: List[int]) -> int:
        left = 0
        right = len(nums)-1
        while left < right:
            mid = left + (right - left) //2 
            if nums[mid] >= nums[right]:
                left = mid + 1
            if nums[mid] < nums[right]:
                right = mid
        return nums[left]
            
#O(lgn) solution to find the smallest item in a sorted/partly sorted array
#using binary search