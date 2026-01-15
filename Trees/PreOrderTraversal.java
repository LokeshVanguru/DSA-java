class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

//problem:Given root of a binary tree .print the preorder traversal of the give Binary Tree.


//   inorder---    root-----left tree-------right tree

void preorderTraversal(Node root)
{
    if(root!=null)
    {
        System.out.print(root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}

//time complexity:O(n)-->n is number nodes of the tree
//space complexity:O(h)-->h i height of the binary tree