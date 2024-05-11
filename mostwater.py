height = [1,8,6,2,5,4,8,3,7]
def most_water(lst):
    #pointer
    left = 0
    right = len(lst)-1
    curr_area = 0
    area = 0
    while left < right:
        #area formula
        curr_area = min(lst[left],lst[right]) * (right - left)
        area = max(area,curr_area)
        if lst[left] > lst[right]:
            right-=1
        else:
            left+=1
    return area

print(most_water(height))
#O(n) solution: no need to loop, just iterate through the list of heights. 