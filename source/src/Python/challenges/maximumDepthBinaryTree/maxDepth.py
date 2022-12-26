class MaxDepth(object):

    def __init__(self):
        print("Max Depth")

    def maxDepth(self, root):
        # print("Calculating max depth")
        if root is None:
            return 0
        else:
            return max(self.maxDepth(root.left), self.maxDepth(root.right)) + 1
