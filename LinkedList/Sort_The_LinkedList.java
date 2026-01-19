// Given the head of a linked list,
//  return the list after sorting it in ascending order.


//  Naive Approach --->Bubble sorting
 public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        for(int i=0;i<len-1;i++)
        {
            ListNode curr=head;
            for(int j=0;j<len-1-i;j++)
            {
                if(curr.val>curr.next.val)
                {
                     int data=curr.val;
                     curr.val=curr.next.val;
                     curr.next.val=data;
                }
                curr=curr.next;
            }
        }
        return head;
    }

// Time Complexity:O(n*n)
// Space Complexity:O(1)


// Optimal--->Merge Sort