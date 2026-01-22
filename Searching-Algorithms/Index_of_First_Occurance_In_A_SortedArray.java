// Given an sorted Array arr[] and target.
// Find the first occurance in the sorted array
// target is not present in array return -1.

// Naive Approach-->O(n)

// Optimal:

public int firstOccurance(int arr[],int target)
{
    int low=0;
    int high=arr.length-1;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(target>arr[mid])
        {
            low=mid+1;
        }
        else if(target<arr[mid])
        {
            high=mid-1;
        }
        else{
            if(mid==0 || arr[mid-1]!=arr[mid])
            {
                return mid;
            }
            else{
                high=mid-1;
            }
        }
    }
    return -1;
}

// Time Complexity:O(logn)