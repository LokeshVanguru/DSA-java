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

//problem:Given root of a binary tree .print the inorder traversal of the give Binary Tree.


//   inorder---    left tree-----root-------right tree

void inorderTraversal(Node root)
{
    if(root!=null)
    {
        inorderTraversal(root.left);
        System.out.print(root.data);
        inorderTraversal(root.right);
    }
}

//time complexity:O(n)-->n is number nodes of the tree
//space complexity:O(h)-->h i height of the binary tree
