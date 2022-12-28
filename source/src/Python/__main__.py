from source.src.Python.challenges.addTwoNumbers import ListNode, addToNumbers

if __name__ == "__main__":

    node1 = ListNode(5)
    node2 = ListNode(6, node1)
    node3 = ListNode(4, node2)

    node4 = ListNode(2)
    node5 = ListNode(4, node4)
    node6 = ListNode(3, node5)

    solution = addToNumbers
    sol = solution.addTwoNumbers(solution,node3, node6)

    while sol is not None:
        print(f"Value: {sol.val}" )
        sol = sol.next