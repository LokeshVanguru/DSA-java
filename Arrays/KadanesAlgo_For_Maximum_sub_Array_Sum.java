// Given an integer array arr[], 
// find the subarray with the largest sum, and return its sum.

// using Kadane's Algorithm to reduce time complexity

public int maxSubArray(int[] arr) {
        int n=arr.length;
        int curr=arr[0];
        int ans=arr[0];
        for(int i=1;i<n;i++)
        {
             curr=Math.max(arr[i],curr+arr[i]);
             ans=Math.max(curr,ans);
        }
        return ans;  
    }

// Time Complexity:O(n)
// Space Complexity:O(1)