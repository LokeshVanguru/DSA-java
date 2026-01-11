// Problem:
//      Given an Array of size n.the task is to sort the array using bubble sort Algorithm.

// Code:

void bubbleSort(int arr[],int n)
{
    for(int i=0;i<n-1;i++)
        {
            boolean flag=true;
            for(int j=0;j<n-1-i;j++)
                {
                    if(arr[j]>arr[j+1])
                        {
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                            flag=false;
                        }
                }
                if(flag==true)
                    {
                        return;
                    }
        }
}

// Time complexity:
         Best Case:O(n);
         Average Case:O(n*n);
         Worst Case:O(n*n);

// Stable Algorithm
// in-place Algorithm (no extra space need)
     