// Given the root of the binary tree,check the tree satifies the child sum property or not.

// Children sum Property---------------------------root.data=root.left.data+root.right.data-------------

// check for all sub tresss

// if root has no children it will be a valid.

// if Node==null it will be valid

// if(every node returns true)  -->true
// else--->false

public boolean isSumProperty(Node root) {
        if(root==null)
        {
            return true;
        }
        if(root.left==null && root.right==null)
        {
            return true;
        }
        int sum=0;
        if(root.left!=null)
        {
           sum=sum+root.left.data;
        }
        if(root.right!=null)
        {
            sum=sum+root.right.data;
        }
        return root.data==sum && isSumProperty(root.left) && isSumProperty(root.right);   
    }


// Time Complexity:O(n)--> we visting evert node one time only
// Space Compelxity:O(h)-->height of the tree(for recursive call stack)