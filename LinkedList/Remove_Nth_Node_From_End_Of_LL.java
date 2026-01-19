// leet code---->19
// Given the head of a linked list,
//  remove the nth node from the end of the list and return its head.

 public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
           len++;
           temp=temp.next;
        }
        if(n>len || head==null)
        {
            return head;
        }
        if(len==n)
        {
            return head.next;
        }
        ListNode curr=head;
        for(int i=1;i<=len-n-1 && curr!=null;i++)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
        
    }

 // Time Complexity:O(n)
 // Space Complexity:O(1)