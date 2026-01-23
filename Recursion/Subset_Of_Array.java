// Given an integer array nums of unique elements, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        recursion(arr,list,0,mainlist);
        return mainlist;
        
    }
    static void recursion(int arr[],ArrayList<Integer> list,int index,List<List<Integer>> mainlist)
    {
        if(index==arr.length)
        {
            mainlist.add(new ArrayList<>(list));
            return;
        }
        recursion(arr,list,index+1,mainlist);
        list.add(arr[index]);
        recursion(arr,list,index+1,mainlist);
        list.remove(list.size()-1);
    }

// Time Complexity:o(2^n * n)
// Space Complexity:O(2^n * n)