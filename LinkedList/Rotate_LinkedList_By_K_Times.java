    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        int len=0;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        k=k%len;
        if(k==0)
        {
            return head;
        }
        int pos=len-k;
        temp=head;
        int curpos=0;
        while(temp!=null && curpos<pos-1)
        {
           curpos++;
           temp=temp.next;
        }
        ListNode NewHead=temp.next;
        temp.next=null;
        temp=NewHead;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        return NewHead;  
    }

// Time Complexity:O(n)
// Space Complexity:O(1)