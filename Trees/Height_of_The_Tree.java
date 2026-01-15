//problem: given the root of the binary Tree.the task is the find the height of the tree.

// we can use depth for search traversal postorder --> left tree,right tree after root.

// here i use postorder traversal.

// use can use level order also by counting no of levels.

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

int height(Node root)
{
   if(root==null)
   {
    return 0;
   }
   return 1 +Math.max(height(root.left),height(root.right));
}

Time Complexity:O(n)
Space Complexity:O(h)-->height of the binary tree