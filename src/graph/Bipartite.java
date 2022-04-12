package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
    public boolean bfsCheck(ArrayList<ArrayList<Integer>> adj ,int node, int []color){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        color[node]=-1;
        while (!q.isEmpty()){
            Integer nde=q.poll();
            for(Integer it:adj.get(nde)){
                if(color[it]==-1){
                    color[it]=1-color[nde];
                    q.add(it);
                }
                else if(color[it]==color[nde]){
                    return false;
                }
            }
        }
    return true;
    }
    public boolean checkBipartite(ArrayList<ArrayList<Integer>> adj, int v){
        int []color=new int[v];
        for (int i = 0; i <v ; i++) {
            color[i]=-1;
        }
        for (int i = 0; i < v; i++) {
            if(color[i]==-1){
                if(!bfsCheck(adj , i, color)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

            Bipartite g=new Bipartite();
            int v=5;
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for (int i = 0; i < v; i++) {
                adj.add(new ArrayList<>());
            }
            graphs.addEdge(adj, 0, 1);
            graphs.addEdge(adj, 0, 4);
            graphs.addEdge(adj, 1, 2);
            graphs.addEdge(adj, 1, 3);
            graphs.addEdge(adj, 2, 4);
            graphs.addEdge(adj, 2, 3);
            graphs.addEdge(adj, 3, 4);
            graphs.printGraph(adj);
            System.out.println(g.checkBipartite(adj, v));
        }

}
