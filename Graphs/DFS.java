// Given a dis-connected undirected graph containing V vertices, 
// represented by a 2-d adjacency list adj[][].

//Traverse using Depth First Search

public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[]=new boolean[adj.size()];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<adj.size();i++)
        {
            if(visited[i]==false)
            {
                depthfs(i,adj,visited,list);
            }
        }
        return list;
        
        
        
    }
    static void depthfs(int v,ArrayList<ArrayList<Integer>> adj,boolean visited[],ArrayList<Integer> list)
    {
        list.add(v);
        visited[v]=true;
        for(int u:adj.get(v))
        {
            if(visited[u]==false)
            {
            depthfs(u,adj,visited,list);
            }
        }
    }

// Time Complexity:O(V+E)
//       visit every vertex once and check each edge once
// Space Complexity:O(V) -->  worst case recursive call stack-->O(V)