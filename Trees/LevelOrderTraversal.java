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


// problem : given the root of the binary tree.the task print the level order traversal .
ArrayList<Integer> levelOrderTraversal(Node root)
{
    ArrayList<Integer> list=new ArrayList<>();
    if(root==null)
    {
        return list;
    }
    Queue<Node> que=new LinkedList<>();
    que.add(root);
    while(!que.isEmpty())
    {
        Node temp=que.poll();
        list.add(temp.data);
        if(temp.left!=null)
        {
            que.add(temp.left);
        }
        if(temp.right!=null)
        {
            que.add(temp.right);
        }
    }
    return list;
}

// Time Complexity:O(n)
// Space Complexity:O(w)-->width of the binary tree 