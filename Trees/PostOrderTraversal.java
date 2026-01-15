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

//problem:Given root of a binary tree .print the postorder traversal of the give Binary Tree.


//   inorder---    left tree-------right tree------root

void postorderTraversal(Node root)
{
    if(root!=null)
    {
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data);
    }
}

//time complexity:O(n)-->n is number nodes of the tree
//space complexity:O(h)-->h i height of the binary tree