package graph;
import java.util.*;
/*Breadth first search is a traversal technique in which we traverse all the node of the graph in a
breadth-wise motion . In BFS, we traverse one level at a time and then jump to the next level .In a
graph, the traversal can start from any node and cover all the nodes level-wise

time complexity is O(V+E)
where V is a number of vertices in the graph ad E is a number of edges in the graph.

Application of the breadth first search
1->Peer To Peer Networks
2->Broadcasting in NetWork
3->Finding all node within one connected component
4->Path Finding
5->GPS Navigation
 */
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
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for (int i = 0; i <adj.size() ; i++) {
            System.out.print(i);
            for (int j = 0; j <adj.get(i).size() ; j++) {
                System.out.print("->"+adj.get(i).get(j));
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    bfsOfTheGraph g=new bfsOfTheGraph();
    int v=5;
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    for (int i = 0; i < v; i++) {
        adj.add(new ArrayList<>());
    }
    addEdge(adj, 0, 1);
    addEdge(adj, 0, 4);
    addEdge(adj, 1, 2);
    addEdge(adj, 1, 3);
    addEdge(adj, 1, 4);
    addEdge(adj, 2, 3);
    addEdge(adj, 3, 4);
    printGraph(adj);
    System.out.println(g.bfs(adj, v));
}
}
