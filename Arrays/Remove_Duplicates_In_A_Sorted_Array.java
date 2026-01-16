// Given the  Sorted Array arr[] .The Task is Remove Duplicates  
// and return modified array length without using extra space.

 public int removeDuplicates(int[] arr) {
        int left=1;
        for(int right=1;right<arr.length;right++)
        {
             if(arr[right]!=arr[right-1])
             {
                arr[left]=arr[right];
                left++;
             }
        }
        return left;     
    }

// Time Complexity:O(n)
// Space Complexity:O(1)