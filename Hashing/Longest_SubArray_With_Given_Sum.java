// Given the Array arr[] and integer k;
// It contains only positive and negatives integers.
// The task is find the largest sub array length whose sum is equal to k.

// Approcah:
//    1.Brute force by checking all subarrays O(n*n)
//    2.using Prefix sum + HashMap (Optimal)

public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int psum=0;
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
           psum=psum+arr[i];
           if(psum==k)
           {
            result=1+i;
           } 
           if(!map.containsKey(psum))
           {
            map.put(psum,i);
           }
           if(map.containsKey(psum-k))
           {
            result=Math.max(result,i-map.get(psum-k));
           }
        }
        return result; 
    }

// Time Complexity:O(n)
// Space Complexity:O(n)-->due to HashMap.