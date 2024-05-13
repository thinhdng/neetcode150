def threesum(lst):
    lst.sort()  # Sort the list
    n = len(lst)
    result = []

    for i in range(n-2):
        if i > 0 and lst[i] == lst[i-1]:
            continue  # Skip duplicates

        left = i + 1
        right = n - 1

        while left < right:
            total = lst[i] + lst[left] + lst[right]

            if total == 0:
                result.append([lst[i], lst[left], lst[right]])
                left += 1
                right -= 1

                # Skip duplicates
                while left < right and lst[left] == lst[left - 1]:
                    left += 1
                while left < right and lst[right] == lst[right + 1]:
                    right -= 1

            elif total < 0:
                left += 1
            else:
                right -= 1

    return result

num = [0,0,0]
print(threesum(num))
#Worst case O(n^2), best case O(nlgn) -> the sort is already O(nlgn)