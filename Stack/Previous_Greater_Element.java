// You are given an integer array arr[ ]. 
// For every element in the array, your task is to determine its Previous Greater Element (PGE).
// The Previous Greater Element (PGE) of an element x is the first element 
// that appears to the left of x in the array and is strictly greater than x.

// Note: If no such element exists, assign -1 as the PGE for that position.

static ArrayList<Integer> preGreaterEle(int[] arr) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        list.add(-1);
        for(int i=1;i<arr.length;i++)
        {
            while(!st.isEmpty() && st.peek()<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                list.add(-1);
            }
            else
            {
                list.add(st.peek());
            }
            st.push(arr[i]);
        }
        return list;
    }

// Time Complexity:O(n)
// Space Complexity:O(n)
     