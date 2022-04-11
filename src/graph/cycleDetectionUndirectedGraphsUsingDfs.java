package graph;

import java.util.ArrayList;

public class cycleDetectionUndirectedGraphsUsingDfs {
    public boolean checkForCycle(int node, int parent, boolean[]vis, ArrayList<ArrayList<Integer>>adj){
        vis[node]=true;
        for(Integer it:adj.get(node)) {
            if (!vis[it]) {
                if (checkForCycle(it, node, vis, adj)) {
                    return true;
                } else if (it != parent) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>>adj){
        boolean []vis=new boolean[v];
        for (int i = 0; i <v ; i++) {
            if(!vis[i]){
                if(checkForCycle(i, -1, vis, adj)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        cycleDetectionUndirectedGraphsUsingDfs g=new cycleDetectionUndirectedGraphsUsingDfs();
        int V=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        graphs.addEdge(adj, 0, 1);
        graphs.addEdge(adj, 0, 4);
        graphs.addEdge(adj, 1, 2);
        graphs.addEdge(adj, 1, 3);
        graphs.addEdge(adj, 1, 4);
        graphs.addEdge(adj, 2, 3);
        graphs.addEdge(adj, 3, 4);
        graphs.printGraph(adj);
        System.out.println(g.isCycle(V, adj));
    }
}
