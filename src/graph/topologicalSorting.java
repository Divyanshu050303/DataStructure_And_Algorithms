package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class topologicalSorting {
    private void findTopoSort(int node, int[]vis, ArrayList<ArrayList<Integer>>adj, Stack<Integer> st) {
        vis[node] = 1;
        for(Integer it:adj.get(node)){
            if(vis[it]==0){
                findTopoSort(it, vis, adj, st);
            }
        }
        st.push(node);
    }
    public int[] topoSort(int n, ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> st=new Stack<>();
        int[]vis=new int[n];
        for (int i = 0; i <n ; i++) {
            if(vis[i]==0){
                findTopoSort(i, vis, adj, st);
            }
        }
        int []topo=new int[n];
        int ind=0;
        while(!st.isEmpty()){
            int t=st.pop();
            topo[ind]=t;
            ind++;
        }
        return topo;
    }

    public static void main(String[] args) {
        topologicalSorting topo=new topologicalSorting();

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
        System.out.println(Arrays.toString(topo.topoSort(v, adj)));
    }

}
