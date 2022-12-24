from source.src.Python.challenges.maximumDepthBinaryTree.TreeNode import TreeNode
from source.src.Python.challenges.maximumDepthBinaryTree.maxDepth import MaxDepth

if __name__ == "__main__":

    node7 = TreeNode(10)
    node6 = TreeNode(8, node7)
    node1 = TreeNode(9)
    node2 = TreeNode(15, node6)
    node3 = TreeNode(7)
    node4 = TreeNode(20, node2, node3)
    node5 = TreeNode(3, node1, node4)

    depth = MaxDepth()

    print(f"Root has child left {node5.left.val} and right {node5.right.val}")
    print(f"Max Depth of Tree {depth.maxDepth(node5)}")
