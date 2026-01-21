// The stock span problem is a financial problem where we have a series of daily price quotes 
// for a stock and we need to calculate the span of stock price for all days.
// You are given an array arr[] representing daily stock prices, 
// the stock span for the i-th day is the number of consecutive days up to day i 
// (including day i itself) for which the price of the stock is less than or equal to the price on day i. 
// Return the span of stock prices for each day in the given sequence.

// Input: arr[] = [100, 80, 90, 120]
// Output: [1, 1, 2, 4]

// Input: arr[] = [10, 4, 5, 90, 120, 80]
// Output: [1, 1, 2, 4, 5, 1]

// Naive Approach:O(n*n)

// Optimal Approach using stack 

// Code:

public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(arr[0],0));
        list.add(1);
        for(int i=1;i<arr.length;i++)
        {
            while(!st.isEmpty() && st.peek().data<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                list.add(i+1);
            }
            else
            {
                list.add(i-st.peek().index);
            }
            st.push(new Pair(arr[i],i));
        }
        return list;
    }

class Pair
{
    int data;
    int index;
    Pair(int data,int index)
    {
        this.data=data;
        this.index=index;
    }
}
//we can solve this directtly storing index in stack.
// Time Complexity:O(n)
// Space Complexity:O(n)

// OPtimal Approach by storing indexes only:

public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.push(0);
        list.add(1);
        for(int i=1;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                list.add(i+1);
            }
            else
            {
                list.add(i-st.peek());
            }
            st.push(i);
        }
        return list;
    }

// Time Complexity:O(n)
// Space Complexity:O(n)