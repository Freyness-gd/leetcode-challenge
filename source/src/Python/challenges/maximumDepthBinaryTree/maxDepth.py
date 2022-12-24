class MaxDepth(object):

    def __init__(self):
        print("Max Depth")

    def maxDepth(self, root):
        # print("Calculating max depth")
        if root.left is None and root.right is None:
            return 1
        elif root is None:
            return 0
        elif root.left is None and root.right is not None:
            return 1 + self.maxDepth(root.right)
        elif root.left is not None and root.right is None:
            return 1 + self.maxDepth(root.left)
        else:
            return 1+ self.maxDepth(root.left) if self.maxDepth(root.left) >= \
                                           self.maxDepth(root.right) else 1 + self.maxDepth(root.right)
