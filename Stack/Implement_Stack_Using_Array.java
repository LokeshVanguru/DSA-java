// Implement a Stack using an Array, where the size of the array, n is given.
// The Stack must support the following operations:

// (i) push(x): Insert an element x at the top of the stack.
// (ii) pop(): Remove the element from the top of the stack.
// (iii) peek(): Return the top element if not empty, else -1.
// (iv) isEmpty(): Return true if the stack is empty else return false.
// (v) isFull(): Return true if the stack is full else return false.

class myStack {
    int[] arr;
    int size;
    int cap;
    public myStack(int n) {
        // Define Data Structures
        arr=new int[n];
        size=-1;
        cap=n;
    }
    public boolean isEmpty() {
        // check if the stack is empty
        return size==-1;
    }
    public boolean isFull() {
        // check if the stack is full
        return size+1==cap;
    }
    public void push(int x) {
        // Inserts x at the top of the stack
        if(size+1!=cap)
        {
        size++;
        arr[size]=x;
        }
    }
    public void pop() {
     // Removes an element from the top of the stack
        if(size!=-1)
        {
            size--;
        }
    }
    public int peek() {
        if(size!=-1)
        {
        return arr[size];
        }
        return -1;
        // Returns the top element of the stack
    }
}

// All stack operations
//  (push, pop, peek, isEmpty, isFull) run in constant time O(1), 
//  while stack initialization takes O(n).