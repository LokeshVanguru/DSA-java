// Given a dis-connected undirected graph containing V vertices, 
// represented by a 2-d adjacency list adj[][].

// Traverse using Bredth First Search.

// Code:

public static List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> list=new ArrayList<Integer>();
        Queue<Integer> que=new LinkedList<>();
        boolean visited[]=new boolean[V];
        // for disconnected graphs
        for(int i=0;i<V;i++) 
        {
            if(visited[i]==false)
            {
                que.add(i);
                visited[i]=true;
                while(!que.isEmpty())
                {
                    int v=que.poll();
                    list.add(v);
                    for(int u:adj.get(v))
                    {
                        if(visited[u]==false)
                        {
                            que.add(u);
                            visited[u]=true;
                        }
                    }
                }
            }
        }
        return list;
    }

// Time Complexity:O(V+E)
//       visit every vertex once and check each edge once
// Space Complexity:O(V)