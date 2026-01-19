
// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

// Code:

public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null)
        {
            ListNode nextNode=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nextNode;
        }
        while(head!=null && prev!=null)
        {
            if(head.val!=prev.val)
            {
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;  
    }

// Time CompleXity:O(n);
// Space Complexity:O(1);

// 1.find middle of the linkedlist
// 2.reverse the half of the linked list
// 3.compare both linked list original list adn reversed half linked list