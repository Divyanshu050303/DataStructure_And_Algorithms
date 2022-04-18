package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topologicalSortingByBfs {
    public boolean topologicalSortingBYBfs(int n , ArrayList<ArrayList<Integer>>adj){
        int []inDegree=new int[n];
        for (int i = 0; i <n ; i++) {
            for(Integer it:adj.get(i)){
                inDegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0) q.add(i);
        }
        int cnt=0;
        while (!q.isEmpty()){
            Integer node=q.poll();
            cnt++;
            for(Integer it:adj.get(node)){
                inDegree[it]++;
                if(inDegree[it]==0){
                    q.add(it);
                }
            }
        }
        return cnt != n;
    }
    public static void main(String[] args) {
        topologicalSortingByBfs g=new topologicalSortingByBfs();
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
        System.out.println(g.topologicalSortingBYBfs(V, adj));
    }
}
