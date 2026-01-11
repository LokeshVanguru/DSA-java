// Question:
//      Given an Array arr[] of size n.The task is find the Second largest element in the Array.

//---> 1.using Arrays.sort(arr) and return arr[n-2] element it takes nlogn time.

//---> 2.first find max element and replace max element elment with Integer.MIN_VALUE and find 2 time Max element
//       and return. this way takes two times of Array traversal 
//       T.c:O(n);

//Edge Cases:1.arrays contains only 1 element at that case array can't have second max
//           2.Array contains all same values at that time also we can't have second max


//--->Optimal Aproach:

int second_Max_Element(int arr[],int n)
{
    // arrays contains only one element
    if(n<2)
    {
        return -1;
    }
    int first_max=Integer.MIN_VALUE;
    int second_max=Integer.MIN_VALUE;

    for(int i=0;i<n;i++)
    {
        if(arr[i]>first_max)
        {
            second_max=first_max;
            first_max=arr[i];
        }
        else if(arr[i]>second_max && arr[i]!=first_max)
        {
            second_max=arr[i];
        }
    }
    if(second_max==Integer.MIN_VALUE)
    {
        return -1;
    }
    return second_max;
}

//T.C O(n)