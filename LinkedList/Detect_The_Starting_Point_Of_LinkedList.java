// Given the head of a linked list, return the node where the cycle begins. 
// If there is no cycle, return null.

 public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        
        return null;
    }


//Time Complexity:O(n)
//Space Complexity:O(1)