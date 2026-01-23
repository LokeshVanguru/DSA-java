// Given the String str.Genarate all Subsets for the String.

// Code:

public void subset(String str)
{
    String curr="";
    subsetRecursive(str,curr,0);
}
public void subsetRecursive(String str,String curr,int index)
{
    if(str.length()==index)
    {
        System.out.print(curr);
        return;
    }
    subsetRecursive(str,curr,index+1);
    subsetRecursive(str,curr+str.charAt(index),index+1);
}

// Time Complexity:O(2^n)
// Space Complexity:O(n) for call stack
// for all strings O(2^n)
