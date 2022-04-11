package graph;

import java.util.*;

/* Graph is a non-linear data structure consisting of node and edge.The nodes are sometimes also
referred to as vertices and the edge are kine or arcs that connect any two nodes in the graph.

A graph consists of a finite set of vertices and set of edge which connect a pair of nodes.

 Application of the graph is
 1->Graphs are used to define the FLOW OF THE COMPUTER
 2->Graphs are used to represent NETWORKS OF COMMUNICATION
 3->Graphs are used to represent DATA ORGANIZATION
 4->Graphs are used to find THE SHORTEST PATH in ROAD or a NETWORK;
 */
class graphs{
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
    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] vis =new boolean[v+1];
                Queue<Integer> q=new LinkedList<>();
                q.add(0);
                while(q.size()!=0){
                    Integer node =q.poll();
                    bfs.add(node);
                    vis[node]=true;
                    for (Integer it:adj.get(node)) {
                        if(!vis[it]){
                            vis[it]=true;
                            q.add(it);
                        }
                    }
                }
        return bfs;
    }
    public void dfs(int node, boolean []vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDfs){
        storeDfs.add(node);
        vis[node]=true;
        for(Integer it:adj.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, adj, storeDfs);
            }
        }
    }
    public ArrayList<Integer> dfsOfTheGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> storeDFS=new ArrayList<>();
        boolean []vis=new boolean[v+1];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(i, vis, adj, storeDFS);
            }
        }
        return storeDFS;
    }
    static class  Node{
        int first, second;
        Node(int first, int second){
            this.first=first;
            this.second=second;
        }
    }
    public boolean checkForCycle(int s, boolean []vis, ArrayList<ArrayList<Integer>>adj) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s] = true;
        while (!q.isEmpty()) {
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();
            for (Integer it : adj.get(node)) {
                if (!vis[it]) {
                    q.add(new Node(it, node));
                    vis[it] = true;
                } else if (par != it) {
                    return true;
                }
            }
        }
        return false;
    }

        public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
            boolean []vis=new boolean[v];
            Arrays.fill(vis, false);
            int []parent=new int[v];
            Arrays.fill(parent, -1);
            for (int i = 0; i <v ; i++) {
                if(!vis[i]){
                    if(checkForCycle( i, vis, adj)){
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean checkForCycle1(int node, int parent, boolean[]vis, ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(Integer it:adj.get(node)){
            if(!vis[it]){
                if(checkForCycle1(it, node, vis, adj)){
                    return true;
                }
                else if(it!=parent){
                    return true;
                }
            }
        }
        return false;
        }
        public boolean isCycleDfs(int v, ArrayList<ArrayList<Integer>>adj){
        boolean []vis=new boolean[v];
            for (int i = 0; i <v ; i++) {
                if(!vis[i]){
                    if(checkForCycle1(i, -1,vis, adj)){
                        return true;
                    }
                }
            }
            return false;
        }

}
public class graphRepresentation {
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        graphs g=new graphs();
        graphs.addEdge(adj, 0, 1);
        graphs.addEdge(adj, 0, 4);
        graphs.addEdge(adj, 1, 2);
        graphs.addEdge(adj, 1, 3);
        graphs.addEdge(adj, 1, 4);
        graphs.addEdge(adj, 2, 3);
        graphs.addEdge(adj, 3, 4);
        System.out.println("Graph inserted...");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1-> Cycle Detection in Undirected Graph using BFS");
            System.out.println("Press 2 -> Print The Graph");
            System.out.println("Press 3 -> Bfs Of The Graph");
            System.out.println("Press 4 -> Dfs Of The Graph");
            System.out.println("Press 5-> Cycle Detection in Undirected Graph using DFS");
            System.out.println("Press 6 -> Exit");
            System.out.println("Enter the choice");
            int choice=sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Cycle Detection in Undirected Graph using BFS");
                    System.out.println(g.isCycle(v, adj));
                }
                case 2 -> {
                    System.out.println("Your graph is");
                    graphs.printGraph(adj);
                }
                case 3 -> {
                    System.out.println("Bfs Of The Graphs");
                    System.out.println(g.bfsOfGraph(v, adj));
                }
                case 4->{
                    System.out.println("Dfs of the graph");
                    System.out.println(g.dfsOfTheGraph(v, adj));
                }
                case 5 -> {
                    System.out.println("Cycle Detection in Undirected Graph using DFS");
                    System.out.println(g.isCycleDfs(v, adj));
                }
                case 6 -> {
                    System.out.println("Thanks");
                    System.exit(0);
                }
            }
        }
    }
}
