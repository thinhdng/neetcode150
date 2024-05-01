nums = [1,2,0,1]

def longestConsecutive(nums):
    count = 1
    temp_count = 1
    nums = sorted(nums)
    for i in range(0, len(nums)-1):
        if nums[i+1] == nums[i] + 1:
            temp_count+=1
            if count <= temp_count:
                count = temp_count
        elif nums[i+1] == nums[i]:
            pass
        else:
            temp_count = 1
    
    return count
    
print(longestConsecutive(nums))

#time = O(nlgn + n)