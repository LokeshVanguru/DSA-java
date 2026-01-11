// Problem:
//      check if the element is present in the array or not.
//      using linear search
//      traverse through every element and check the element is present or not
//      if present return true
//      else return false

boolean linearSearch(int arr[],int target)
{
    for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                {
                    return true;
                }
        }
        return false;
}

//Time Complexity--O(n)
// we can prefer iterative linear search than recursive because recursive takes space for recursive call stack


//RecursiveLinearSearch
//-------------take int curindex=0;
boolean recursiveLinearSearch(int arr[],int targer,int curindex)
{
    if(curindex==arr.length)
        {
            return false;
        }
    if(arr[curindex]==target)
        {
            return true;
        } 
    return recursiveLinearSearch(arr,target,curindex+1);
}
