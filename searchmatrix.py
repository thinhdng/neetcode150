class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False
        if len(matrix) == 1 and len(matrix[0]) == 1:
            return target == matrix[0][0]
        n = 0
        midptr = 0
        leftptr = 0
        rightptr = len(matrix[n]) - 1 
        right = matrix[n][len(matrix[n])-1]
        while target > right and len(matrix) > 1:
            n+=1
            if n < len(matrix):
                right = matrix[n][len(matrix[n])-1]
            else:
                return False
        while leftptr <= rightptr:
            midptr = leftptr + (rightptr-leftptr) // 2
            if matrix[n][midptr] == target:
                return True
            elif matrix[n][midptr] < target:
                leftptr = midptr + 1
            else:
                rightptr = midptr - 1

        return False
    
#O(lg(m*n)) solution. compare the target to the end item of each row, 
#then only search through that row using binary search. 