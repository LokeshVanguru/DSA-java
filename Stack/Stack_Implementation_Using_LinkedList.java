// Implement a Stack using a Linked List, this stack has no fixed capacity and can grow dynamically until memory is available.
// The Stack must support the following operations:

// (i) push(x): Insert an element x at the top of the stack.
// (ii) pop(): Remove the element from the top of the stack.
// (iii) peek(): Return top element if not empty, else -1.
// (iv) isEmpty(): Return true if the stack is empty else return false.
// (v) size(): Return the number of elements currently in the stack.

// Node class
 class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} 

// Stack class
class myStack {
    
    Node head;
    Node tail;
    int pos;
    public myStack() {
        head=null;
        tail=null;
        pos=0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return head==null;
    }

    public void push(int x) {
        pos++;
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        
    }

    public void pop() {
        // Removes the front element of the stack.
        if(head!=null)
        {
            head=head.next;
            pos--;
        }
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
       if(head!=null)
       {
           return head.data;
       }
       return -1;
    }

    public int size() {
        // Returns the current size of the stack.
        return pos;
        
    }
}



// Time Complexity: All stack operations (push, pop, peek, size, isEmpty) run in O(1) time.
// Space Complexity: The stack uses O(n) space to store n elements, with O(1) extra space per operation.