def search(nums, target):
    left = 0
    right = len(nums) - 1
    #base case
    if(len(nums) == 0):
        return -1
    if(len(nums) == 1):
        if target in nums:
            return 0
        else:
            return -1
    
    while left <= right:
        mid = left + (right - left) // 2
        if target == nums[mid]:
            return mid
        elif nums[left] <= nums[mid]:
            if target >= nums[left] and target < nums[mid]:
                right = mid - 1
            else:
                left = mid + 1
        else:
            if target > mid and target <= nums[right]:
                left = mid + 1
            else:
                right = mid - 1
    return -1

#O(lgn), using binary search