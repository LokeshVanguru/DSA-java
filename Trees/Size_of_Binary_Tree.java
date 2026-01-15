// Given the root of the binary tree.
// Find the size of the Binary tree means Count the number of Nodes are present in the Binary tree.

// we can find size of the tree by using any traversal.

// Here I am using post Order Traversal.

int sizeOfTheBinaryTree(Node root)
{
    if(root==null)
    {
        return 0;
    }
    return 1+sizeOfTheBinaryTree(root.left)+sizeOfTheBinaryTree(root.right);
}

// Time Complexity:O(n)
// Space Complexity:O(h)