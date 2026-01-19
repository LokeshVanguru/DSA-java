// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Code:

public ListNode reverseList(ListNode head) {

        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;

    }

// Time CompleXity:O(n)
// Spaec Complexity:O(1)

// recursive Solution:

public ListNode reverseList(ListNode head) {

        ListNode prev=null;
        ListNode curr=head;
        return recursive(curr,prev);
        
        

    }  

    public static ListNode recursive(ListNode curr,ListNode prev)
    { 
        if(curr==null)
        {
            return prev;
        }
        ListNode nextnode=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextnode;
         return recursive(curr,prev);

    }

// Time CompleXity:O(n)
// Space Complexity:O(n)