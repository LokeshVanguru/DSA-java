// Given An array arr[],rotate the array to the right by k steps ,where k is not-negative.

// Edge Cases:
//   1.if n==1 or n==0 return arr
//   2.if k is greater than k we can rotate k%arr.length times
//   3.k%n is equal to 0 return array

example:
arr[]=[1,2,3,4,5] k=2
output:[4,5,1,2,3]

public void rotate(int[] arr, int k) {
        int n=arr.length;
        if(n==1 || n==0 )
        {
            return ;
        }
        int rotate=k%n;
        if(rotate==0)
        {
            return;
        }
        reverse(arr,0,n-rotate-1);
        reverse(arr,n-rotate,n-1);
        reverse(arr,0,n-1);

        
    }
    static void reverse(int[] arr,int left,int right)
    {
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
        
   
// Time Complexity:O(n)
// Space Complexity:O(1)
    