#Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        slow, fast = head, head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
        #second half of the list
        second = slow.next
        prev = slow.next = None
        
        #reverse the 2nd half of the list
        while second:
            temp = second.next
            second.next = prev
            prev = second
            second = temp
            
        first, second = head, prev
        
        #merge 2 head
        while second:
            temp1, temp2 = first.next, second.next 
            first.next = second
            second.next = temp1
            first, second = temp1, temp2
        