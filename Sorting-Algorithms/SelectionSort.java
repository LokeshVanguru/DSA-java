// Problem:
//      Given an Array arr[] of size n.The task is sort the array using selection sort Algorithm.

// Code:

      void selectionSort(int arr[],int n)
      {
        for(int i=0;i<n-1;i++)
            {
                int min=i;
                for(int j=i+1;j<n;j++)
                    {
                        if(arr[min]>arr[j])
                            {
                                min=j;
                            }
                    }
                    int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
            }
      }


// Time complexity:
//      Best Case:O(n*n)
//      Worst Case:O(n*n);
//      Average Case:O(n*n);
    
// not-stable Algorithm
// in-place Algorithm