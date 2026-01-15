// Given the root of the Binary tree. find the maximum node.data(element) in the binary tree.

// we can MAX element by using any traversal.

int maxElement(Node root)
{
    if(root==null)
    {
        return Integer.MIN_VALUE;
    }
    return Math.max(root.data,Math.max(maxElement(root.left),maxElement(root.right)));
}

// Time Complexity:O(n)
// Space Complexity:O(h)