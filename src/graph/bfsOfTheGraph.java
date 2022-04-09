package graph;
import java.util.*;
public class bfsOfTheGraph {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>>adj, int v){
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[]vis=new boolean[v+1];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        while (queue.size()!=0) {
            Integer node = queue.poll();
            bfs.add(node);
            vis[node] = true;

            for (Integer it : adj.get(node)) {
                if (!vis[it]) {
                    vis[it] = true;
                    queue.add(it);
                }
            }
        }
        return bfs;
    }
public static void main(String[] args) {
    bfsOfTheGraph g=new bfsOfTheGraph();
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
    System.out.println(g.bfs(adj, v));
}
}
