class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        days = [0] * len(temperatures)  # Initialize the answer list with zeros
        stack = collections.deque()  # Use a deque for the stack

        for i in range(len(temperatures)):
            # While stack is not empty and the current temperature is greater than the temperature at the index stored at the top of the stack
            while stack and temperatures[i] > temperatures[stack[-1]]:
                prev_index = stack.pop()  # Pop the index from the stack
                days[prev_index] = i - prev_index  # Calculate the difference in days
            stack.append(i)  # Push the current index onto the stack

        return days

#O(n), uses a stack!