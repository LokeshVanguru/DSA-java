// leet-code-->155
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:

// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function.

// Code:

class MinStack {

    Stack<Integer> ms;
    Stack<Integer> as;


    public MinStack() {
        ms=new Stack<>();
        as=new Stack<>();
    }
    
    public void push(int val) {
        if(ms.isEmpty())
        {
            ms.push(val);
            as.push(val);
        }
        else
        {
            ms.push(val);
            if(ms.peek()<=as.peek())
            {
                as.push(val);
            }
        }
        
    }
    
    public void pop() {
        if(ms.peek()==as.peek())
        {
            as.pop();
        }
        ms.pop();

        
    }
    
    public int top() {
        if(!ms.isEmpty())
        {
        return ms.peek();
        }
        return -1;
        
    }
    
    public int getMin() {
        if(!as.isEmpty())
        {
        return as.peek();
        }
        return -1;
        
    }
}



