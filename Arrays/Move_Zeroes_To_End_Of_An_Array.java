// Given the Array arr[].
// The Task is Move all Zeroes to end of the Array.

// Example:
//  arr[]=[0,0,1,2,3,0,4]
//  output:[1,2,3,4,0,0,0];

 public int[] moveZeroes(int[] arr) {
        int n=arr.length;
        int left=0;
        for(int right=0;right<n;right++)
        {
            if(arr[right]!=0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
        } 
        return arr; 
    }

// Time Complexity:O(n)
// Space Complexity:O(1)