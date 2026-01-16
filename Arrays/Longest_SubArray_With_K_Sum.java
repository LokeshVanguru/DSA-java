// Given the Array arr[] and integer k;
// It contains only positive integers.
// The task is find the largest sub array length whose sum is equal to k.

// Approcah:
//    1.Brute force by checking all subarrays O(n*n)
//    2.using sliding window + Two Pointer Approach (Optimal)

// Optimal:

public int longestSubarray(int[] arr, int k) {
        int n=arr.length;
        int sum=0;
        int maxlength=0;
        int left=0;
        for(int right=0;right<n;right++)
        {
            sum=sum+arr[right];
            while(sum>k)
            {
                sum=sum-arr[left];
                left++;
            }
            if(sum==k)
            {
               maxlength=Math.max(maxlength,right-left+1);
            }
        }
        return maxlength; 
    }

// Time Complexity:O(n)
//      outer loop-->O(n)
//      inner loop-->O(n) total
//      total=O(n)+O(n)--->O(n)
// Space Complexity:O(1)