// Question:
//      Given an Array arr[] of size n.The task is find the largest element in the Array.

Code:
    int largest(int[] arr,int n)
    {
        int lar=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>lar)
            {
                lar=arr[i];
            }
        }
        return lar;
    }

// Time Complexty :O(n(size of the Array))
// Space Complexity :O(1) constant sapce required