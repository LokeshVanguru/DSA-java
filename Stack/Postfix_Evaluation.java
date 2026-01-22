// You are given an array of strings arr[] that represents a valid arithmetic expression 
// written in Reverse Polish Notation (Postfix Notation). 
// Your task is to evaluate the expression and return an integer representing its value.

// Input: arr[] = ["2", "3", "1", "*", "+", "9", "-"]
// Output: -4
// Explanation: If the expression is converted into an infix expression, 
// it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.

public int evaluatePostfix(String[] arr) {
        int n= arr.length;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(!arr[i].equals("+") && !arr[i].equals("-") && !arr[i].equals("*") && !arr[i].equals("/") && !arr[i].equals("^") )
            {
                int num=Integer.valueOf(arr[i]);
                stack.push(num);
            }
            else if(arr[i].equals("+"))
            {
                int num1=stack.pop()+stack.pop();
                stack.push(num1);
            }
            else if(arr[i].equals("-"))
            {
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a-b);
            }
            else if(arr[i].equals("*"))
            {
                int num1=stack.pop()*stack.pop();
                stack.push(num1);
            }
            else if(arr[i].equals("/"))
            {
                int b=stack.pop();
                int a=stack.pop();
                stack.push((int)Math.floor((double)a/b));
            }
            else if(arr[i].equals("^"))
            {
                int b=stack.pop();
                int a=stack.pop();
                stack.push((int)Math.pow(a,b));
            }
        }
        return stack.peek();
    }

// Time Complexity:O(n)
// Space Complexity:O(n)