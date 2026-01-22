// Given an sorted Array arr[] and target.
// Find the last occurance in the sorted array
// target is not present in array return -1.

// Naive Approach-->O(n)

// Optimal:

public int lastOccurance(int arr[],int target)
{
    int length=arr.length;
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
            if(mid==length-1 || arr[mid + 1]!=arr[mid])
            {
                return mid;
            }
            else{
                low=mid+1;
            }
        }
    }
    return -1;
}

// Time Complexity:O(logn)