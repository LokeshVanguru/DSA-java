// Leet-Code--->328

// Given the head of a singly linked list, 
// group all the nodes with odd indices together followed by the nodes with even indices, 
// and return the reordered list.

// The first node is considered odd, and the second node is even, and so on.

public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        // ListNode head1=head;
        ListNode curr1=head;
        ListNode head2=head.next;
        ListNode curr2=head2;
        while(curr1.next!=null && curr2.next!=null)
        {
            curr1.next=curr1.next.next;
            curr1=curr1.next;
            curr2.next=curr1.next;
            curr2=curr2.next;
        }
        curr1.next=head2;
        return head;  
    }

//Time Complexity:O(n)
//Space Complexity:O(1)