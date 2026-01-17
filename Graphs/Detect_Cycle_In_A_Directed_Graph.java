Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, 
check whether it contains any cycle or not.

//Here i am using topological sort to solve this algorithm.

public boolean isCyclic(int V, int[][] edges) {
        // code here
        //using topological sorting
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        int indegree[]=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int u:adj.get(i))
            {
                indegree[u]++;
            }
        }
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0)
            {
                que.add(i);
            }
        }
        int count=0;
        while(!que.isEmpty())
        {
            int v=que.poll();
            count++;
            for(int u:adj.get(v))
            {
                indegree[u]--;
                if(indegree[u]==0)
                {
                    que.add(u);
                }
            }
        }
        return count<V;
    }

    // Time Complexity:O(V+E);
    // Space Complexity:O(V+E)