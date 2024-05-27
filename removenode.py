#Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(head: ListNode, n: int):
        count = 0
        cur = head

        while cur:
            count+=1
            cur = cur.next

        ind = count - n
        count = 0
        cur = head
        
        if ind == 0:
            return head.next
        
        while count < ind - 1:
            count+=1
            cur = cur.next

        cur.next = cur.next.next
        return head
        
#O(n) time 