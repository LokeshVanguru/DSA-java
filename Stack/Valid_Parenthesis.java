// Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']'. \
// Determine whether the Expression is balanced or not.

// Input: s = "[{()}]"
// Output: true

// Input: s = "([]"
// Output: false

public boolean isBalanced(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                else if(matches(s.charAt(i),st.peek()))
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
           
        }
        
        return st.size()==0;
        
    }
    static boolean matches(Character ch,Character open)
    {
        return (ch=='}' && open=='{') || (ch==']' && open=='[') || (ch==')' && open=='(');
    }

// Time Complexity:O(n)
// Space Complexity:O(n)