// Problem:
//      Given an Array arr[] of size n.The task is sort the array using Insertion Sort sort Algorithm.

// Code:

    void insertionSort(int arr[],int n)
    {
    for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            int j;
            for(j=i-1;j>=0;j--)
                {
                    if(arr[j]>temp)
                        {
                            arr[j+1]=arr[j];
                        }
                        else
                        {
                             break;
                        }
                    
                }
                arr[j+1]=temp;
        }
    }


// Time complexity:
//      Best Case:O(n)
//      Worst Case:O(n*n);
//      Average Case:O(n*n);

// stable Algorithm
// in-place Algorithm