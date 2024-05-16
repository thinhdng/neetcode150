import collections
class MinStack:
    def __init__(self):
        self.stack1 = collections.deque
        self.stack2 = collections.deque

    def push(self, val: int) -> None:
        self.stack1.append(val)
        if len(self.stack2) == 0 or val <= self.stack2[len(self.stack2)-1]:
            self.stack2.append(val)
 
    def pop(self) -> None:
        p = self.stack1.pop()
        if p == self.stack2[len(self.stack2)-1]:
            self.stack2.pop()
    def top(self) -> int:
        return self.stack1[len(self.stack1)-1]

    def getMin(self) -> int:
        return self.stack2[len(self.stack2)-1]

#Python implementation, O(1), better than the solution using arraylist