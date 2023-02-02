package graph;

import java.util.ArrayList;
import java.util.Scanner;

class Rraph{
    public void adjacencyMatrix(){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][]adj=new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int u= sc.nextInt();
            int v= sc.nextInt();
            adj[u][v]=1;
            adj[v][u]=1;
        }
    }
    public void adjacencyList(ArrayList<ArrayList<Integer>> arr, int u, int v){
            arr.get(u).add(v);
            arr.get(v).add(u);
    }
    public void printTheAdjacencyList(ArrayList<ArrayList<Integer>>arr){
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(" -> "+arr.get(i).get(j));
            }
            System.out.println();
        }
    }
}
public class representationOfTheGraph {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj
                = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        Rraph g=new Rraph();

        // Adding edges one by one
        g.adjacencyList(adj, 0, 1);
        g.adjacencyList(adj, 0, 4);
        g.adjacencyList(adj, 1, 2);
        g.adjacencyList(adj, 1, 3);
        g.adjacencyList(adj, 1, 4);
        g.adjacencyList(adj, 2, 3);
        g.adjacencyList(adj, 3, 4);

        g.printTheAdjacencyList(adj);
    }
}
