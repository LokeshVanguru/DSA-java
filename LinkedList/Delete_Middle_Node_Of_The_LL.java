// Leet-Code-->2095
// You are given the head of a linked list.
//  Delete the middle node, and return the head of the modified linked list.


 public ListNode deleteMiddle(ListNode head) {
        ListNode temp=null;
        if(head==null || head.next==null)
        {
            return temp;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=temp.next.next;
        return head;
        
    }

// Time Complexity:O(n)
// Space Complexity:O(1)