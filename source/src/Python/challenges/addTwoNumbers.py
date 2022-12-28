from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class addToNumbers:

    def __init__(self):
        print("Add To Numbers")

    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        node = ListNode(l1.val + l2.val)
        reminder = 0

        if (l1.val + l2.val) >= 10:
            node = ListNode(l1.val + l2.val - 10)
            reminder = 1

        toReturn = node
        toAdd = None
        l1 = l1.next
        l2 = l2.next

        while l1 is not None or l2 is not None:
            if l1 is None:
                l1 = ListNode(0)
            if l2 is None:
                l2 = ListNode(0)
            summe = l1.val + l2.val

            if summe >= 10:
                toAdd = ListNode(summe - 10 + reminder)
                reminder = 1

            elif summe + reminder == 10:
                toAdd = ListNode(0)
            else:
                toAdd = ListNode(summe + reminder)
                reminder = 0

            toReturn.next = toAdd
            toReturn = toAdd

            l1 = l1.next
            l2 = l2.next

        if reminder == 1:
            toReturn.next = ListNode(1)

        return node
