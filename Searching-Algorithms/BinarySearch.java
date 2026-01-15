// Problem:
//      check if the element is present in the array or not.
//      using Binary search
//      if present return true
//      else return false
// Note:Binary Search works on Sorted Arrays.

boolean binarySearch(int arr[],int target)
{
    int n=arr.length;
    if(n==0)
    {
        return false;
    }
    int left=0;
    int right=n-1;
    while(left<=right)
    {
        int mid=left+(right-left)/2;
        if(arr[mid]==target)
        {
            return true;
        }
        else if(arr[mid]>target)
        {
            right=mid-1;
        }
        else
            {
            left=mid+1;
        }   
    }
    return false;
}

// Time Complexity:O(log(n))
//every out input decreses by half.

//------Recursive Binary Search

 boolean recursiveBinarySearch(int arr[],int left,int right,int target)
 {
    if(left>right){
        return false;
    }
    int mid=left+(right-left)/2;
    if(arr[mid]==target)
    {
        return true;
    }
    else if(arr[mid]>target)
    {
        return recursiveBinarySearch(arr,left,mid-1,target);
    }
     else{
         return recursiveBinarySearch(arr,mid+1,right,target);
     }   
}

//Time Complexity:O(log(n))
//Space Complexity:O(log(n)) for recursive call stack