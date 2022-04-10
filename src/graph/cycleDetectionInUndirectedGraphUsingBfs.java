package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class cycleDetectionInUndirectedGraphUsingBfs {
    static class Node{
        int first, second;
        Node(int first,int  second){
            this.first=first;
            this.second=second;
        }
    }
    public boolean cycle(int s, boolean []vis, ArrayList<ArrayList<Integer>>adj){
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s]=true;
        while (!q.isEmpty()){
            int node=q.peek().first;
            int par=q.peek().second;
            q.remove();
            for(Integer it:adj.get(node)){
                if(!vis[it]){
                    q.add(new Node(it, node));
                }
                else if(par!=it){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>>adj){
        boolean[]vis=new boolean[v];
        Arrays.fill(vis, false);
        int []parent=new int[v];
        Arrays.fill(parent, -1);
        for (int i = 0; i <v ; i++) {
            if(!vis[i]){
                if(cycle(i, vis, adj)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        cycleDetectionInUndirectedGraphUsingBfs g=new cycleDetectionInUndirectedGraphUsingBfs();
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
        System.out.println(g.isCycle(v,adj));
    }
}
