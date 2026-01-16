// Given an array arr[] ,
// return true if the array is originally sorted in ascending order 
// or rotated sorted array by number of positions.
// other wise return false.



public boolean check(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[(i+1)%n])
            {
                count++;
            }
        }
        if(count==1 || count==0)
        {
            return true;
        }
        return false;
    }

// count==0 ,means array already sorted ex:[1,2,3,4,4]--.already sorted(order breaks 0 times)

// count==1 ,means array is sorted by some number of rotations ex:[3,4,5,1,2]-->[1,2,3,4,5](order breaks 1 time)

// count>1 ,means array is not sorted after rotations and before rotations-->ex:[1,2,3,5,4](order breaks more than 1 time)

//Time complexity:O(n)-->traverse the arrat at least once
//Space Complexity:O(1)