// Problem:
//      Given an Array arr[] of size n.The task is sort the array using merge sort Algorithm.
//      Divide and Conquer alogorithm

// Code:

public int[] mergeSort(int[] nums) {
    int left=0;
    int right=nums.length-1;
    ms(nums,left,right);
    return nums;

}
static void ms(int[] nums,int left,int right)
{
    if(left<right)
    {
        int mid=(left+right)/2;
        ms(nums,left,mid);
        ms(nums,mid+1,right);
        merge(nums,left,mid,right);
    }
}
static void merge(int arr[],int left,int mid,int right)
{
    int l1=mid-left+1;
    int l2=right-mid;
    int arr1[]=new int[l1];
    int arr2[]=new int[l2];
    for(int i=0;i<l1;i++)
    {
        arr1[i]=arr[left+i];
    }
    for(int i=0;i<l2;i++)
    {
        arr2[i]=arr[mid+1+i];
    }
    int i=0;
    int j=0;
    // int res[]=new int[l1+l2];
    int count=left;
    while(i<l1 && j<l2)
    {
        if(arr1[i]<arr2[j])
        {
            arr[count]=arr1[i];
            i++;
            count++;
        }
        else
        {
            arr[count]=arr2[j];
            j++;
            count++;
        }
    }
    while(i<l1)
    {
        arr[count]=arr1[i];
            i++;
            count++;
    }
    while(j<l2)
    {
        arr[count]=arr2[j];
            j++;
            count++;
    }
    // for(int k=0;k<l1+l2;k++)
    // {
    //     arr[left+k]=res[k];
    // }
}

----------------------------------
// Time complexity:
//      Best Case:O(n*log(n));
//      Worst Case:O(n*log(n));
//      Average Case:O(n*log(n));

// stable Algorithm
// not an in-place Algorithm
//Divide and Conquer
// recursive stack take O(log(n)) space 