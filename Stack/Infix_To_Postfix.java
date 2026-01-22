// You are given a string s representing an infix expression. 
// Convert this infix expression to a postfix expression.

// Infix expression: The expression of the form a op b. 
// When an operator is in between every pair of operands.

// Postfix expression: The expression of the form a b op.
//  When an operator is followed for every pair of operands.

//  Code:

public static String infixToPostfix(String s) {
        StringBuffer ans=new StringBuffer();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            Character ch=s.charAt(i);
            if((int)ch>=97 && (int)ch<=122 || (int)ch>=65 && (int)ch<=90 || (int)ch>=48 && (int)ch<=57)
            {
                ans.append(ch);
            }
            else if(ch=='(')
            {
                stack.push(ch);
            }
            else if(ch==')')
            {
                while(!stack.isEmpty())
                {
                    if(stack.peek()=='(')
                    {
                        stack.pop();
                        break;
                    }
                    ans.append(stack.peek());
                    stack.pop();
                    
                }
            }
            else
            {
                while(!stack.isEmpty() && precedence(stack.peek())>=precedence(ch) && ch!='^')
                {
                    ans.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
        {
            ans.append(stack.pop());
        }
        return new String(ans);
        
    }
    
    static int precedence(Character ch)
    {
        if(ch=='^')
        {
            return 3;
        }
        if(ch=='*' || ch=='/')
        {
            return 2;
        }
        if(ch=='+' || ch=='-')
        {
            return 1;
        }
        return 0;
    }

// Time Complexity:O(n)
// Space Complexity:O(n)
