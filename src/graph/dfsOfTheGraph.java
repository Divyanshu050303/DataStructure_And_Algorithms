package graph;

import java.util.ArrayList;
/* Depth first search is an algorithm for traversing or searching tree or graph data structure .The
algorithm starts at the root node and explore as far as possible along each branch before backtracking

Time complexity of dfs O(V+E)
where V is the number of vertices and E is the number of edge in the graph.


Application of the dfs
1->Path finding
2->Topological Sorting
3->Solving puzzles with only one solution
 */
public class dfsOfTheGraph {
    public void dfs(int node, boolean []vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDfs){
        storeDfs.add(node);
        vis[node]=true;
        for(Integer it:adj.get(node)){
            if(!vis[it]){
                dfs(it, vis, adj, storeDfs);
            }
        }
    }
    public ArrayList<Integer> graphDfs(int v, ArrayList<ArrayList<Integer>>adj){
        ArrayList<Integer> storeDfs=new ArrayList<>();
        boolean []vis=new boolean[v+1];
        for (int i=0;i<v;i++){
            if(!vis[i]){
                dfs(i, vis, adj, storeDfs);
            }
        }
        return storeDfs;
    }

    public static void main(String[] args) {
        dfsOfTheGraph g=new dfsOfTheGraph();
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < v; i++) {
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
        System.out.println(g.graphDfs(v, adj));
    }
}
