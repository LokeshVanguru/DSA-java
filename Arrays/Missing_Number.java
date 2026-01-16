// Given the Array arr[] it has distinct elements [0 t0 n].
// n is the size of the array.
// find the missing number.

// Example:
// arr[]=[0,1,2,3,5,6,7,8]
// output:4

// we can solve this problem by using sorting but it takes O(nlogn)

// Naive Approach:
// By using Mathematics rule sum of n digits formula

public int missingNumber(int[] arr) {
        int n=arr.length;
        int res1=(n*(n+1))/2;
        int res2=0;
        for(int i=0;i<n;i++)
        {
            res2=res2+arr[i];
        }
        return res1-res2;
        
    }

// Time Complexity:O(n)
// Space Complexity:O(1)