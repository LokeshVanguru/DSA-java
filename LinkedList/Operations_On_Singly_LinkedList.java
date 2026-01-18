class ListNode
{
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.data=data;
        this.next=null;
    }
}

//------------------------------------------------------------------

//Insertion at the beginning of the Linked List 
// and X is the Given value of the Node

public ListNode insertAtBeginning(ListNode head,int X)
{
    ListNode temp=new ListNode(X);
    temp.next=head;
    return temp;
}

Time Complexity:O(1)
Space Complexity:O(1)
//-------------------------------------------------------------------------------------
//Insertion at the Last of the Linked List 
// and X is the Given value of the Node

public ListNode insertAtEnd(ListNode head,int X)
{
    ListNode temp=new ListNode(X);
    if(head==null)
    {
        return temp;
    }
    ListNode curr=head;
    while(curr.next!=null)
    {
        curr=curr.next;
    }
    curr.next=temp;
    return head;
}
//Time Complexity:O(n)--> n = no of ListNodes present in the LinkedList.
//Space Complexity:O(1)

// ----------------------------------------------------------------------------------

// Given the Head of the LinkedList .Traverse the LinkedList.

public ArrayList<Integer> traverseLinkedList(ListNode head)
{
    ArrayList<Integer> list=new ArrayList<>();
    ListNode curr=head;
    while(curr!=null)
    {
       list.add(curr.data);
       curr=curr.next;
    }
    return list;
}

//Time Complexity:O(n)
//Space Complexity:O(n)

//--------------------------------------------------------------------------

//Recursive Traversal of a LinkedList

public void recursiveTraversal(ListNode head)
{
    if(head==null)
    {
        return;
    }
    System.out.print(head.data);
    recursiveTraversal(head.next);
}

//Time Complexity:O(n)
//Space Complexity:O(n)-->for recursive call stack

//-----------------------------------------------------------------------------

//Insert at given position of the LinkedList

public ListNode insertAtPoaition(ListNode head,int pos,int X)
{
    ListNode temp=new ListNode(X);
    if(pos==1)
    {
       temp.next=head;
       return temp;
    }
    if(head==null)
    {
        return head;
    }
        
    ListNode curr=head;
    for(int i=1;i<=pos-2 && curr!=null;i++)
    {
       curr=curr.next;
    }
    if(curr==null)
    {
        return head;
    }
    temp.next=curr.next;
    curr.next=temp;
    return head;
}

//Time Complexity:O(n)
//Space Complexity:O(1)

//------------------------------------------------------------------------

//Delete the first Node of the LinkedList

    public ListNode deleteFirstNodeOfTheLinkedList(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        
        return head.next;
    }

//Time Complexity:O(1)
//Space Complexity:O(1)

//---------------------------------------------------------------------------

//Delete Last Node of the Linked List

public ListNode deleteLastNodeOfTheLinkedList(ListNode head)
{
    if(head==null)
    {
        return head;
    }
    if(head.next==null)
    {
        return head.next;
    }
    ListNode curr=head;
    while(curr.next.next!=null)
    {
       curr=curr.next;
    }
    curr.next=null;
    return head;
}

//Time Complexity:O(n)
//Space Complexity:O(1)

//-----------------------------------------------------------------------------

//Search An element in the given Linked List

public boolean search(ListNode head,int x)
{
    while(head!=null)
    {
        if(head.data==x)
        {
            return true;
        }
        head=head.next;
    }
    return false;
}

//Time Complexity:O(n)
//Space Complexity:O(1)