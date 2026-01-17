// Given a Directed Acyclic Graph (DAG) of V (0 to V-1) vertices
//  and E edges represented as a 2D list of edges[][], 
// where each entry edges[i] = [u, v] denotes a directed edge u -> v. 
// Return the topological sort for the given graph.

//It is known as kahn's Algorithm(indegree concept)

public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        int indeg[]=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int u:adj.get(i))
            {
                indeg[u]++;
            }
        }
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(indeg[i]==0)
            {
                que.add(i);
            }
        }
        while(!que.isEmpty())
        {
            int v=que.poll();
            list.add(v);
            for(int u:adj.get(v))
            {
                indeg[u]--;
                if(indeg[u]==0)
                {
                    que.add(u);
                }
            }
        }
        return list;  
    }

// Time Complexity:O(V+E)
// Space Complexity:O(v)

// “Topological sort is mainly used for 
// task scheduling, 
// dependency resolution,
//  course prerequisites, 
//  build systems, 
//  deadlock detection(Cycle detection), 
//  and compiler instruction scheduling.