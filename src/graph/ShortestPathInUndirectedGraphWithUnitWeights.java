package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInUndirectedGraphWithUnitWeights {
    public void ShortestPath(ArrayList<ArrayList<Integer>> adj, int v, int src){
        int []dis=new int[v];
        for(int i=0;i<v;i++){
            dis[i]=10000;
        }
        Queue<Integer> que=new LinkedList<>();
        dis[src]=0;
        que.add(src);
        while (!que.isEmpty()){
            int node=que.poll();
            for(int it:adj.get(node)){
                if(dis[node]+1<dis[it]){
                    dis[it]=dis[node]+1;
                    que.add(it);
                }
            }
        }
        for (int i = 0; i <v ; i++) {
            System.out.print(dis[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ShortestPathInUndirectedGraphWithUnitWeights g=new ShortestPathInUndirectedGraphWithUnitWeights();
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
        g.ShortestPath(adj, v, 0);


    }
}
