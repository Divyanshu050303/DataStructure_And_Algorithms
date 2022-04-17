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
    // this method is used to add the edges in the graph
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    // this method is used to print the graph node
    public static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for (int i = 0; i <adj.size() ; i++) {
            System.out.print(i);
            for (int j = 0; j <adj.get(i).size() ; j++) {
                System.out.print("->"+adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    // this method is used find the bfs of the graph , bfs is used level order traversal to traverse the node in the graph
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
    // this method is used to find the dfs of the graph , dfs is used inOrder traversal to traverse the node in the graph
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
    // for here we check the cycle in the graph

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
        //Cycle Detection in Undirected Graph using DFS
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
        //here we check Bipartite using bfs  in the graph
        public boolean bfsCheck(ArrayList<ArrayList<Integer>>adj, int node, int[]color){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        color[node]=1;
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
        public boolean checkBipartite(ArrayList<ArrayList<Integer>>adj, int v){
        int []color=new int[v];
        for (int i = 0; i < v; i++) {
                color[i]=-1;
            }
        for (int i = 0; i < v; i++) {
                if(color[i]==-1){
                    if(!bfsCheck(adj, i, color)){
                        return false;
                    }
                }
            }
        return true;
    }
    //Check Cycle for Directed Graph
    public boolean CheckCycle(int node, ArrayList<ArrayList<Integer>>adj, int[]vis, int []dfsVis){
        vis[node]=1;
        dfsVis[node]=1;
        for(Integer it:adj.get(node)){
            if(vis[it]==0) {
                if (CheckCycle(it, adj, vis, dfsVis)) {
                    return true;
                }
            }
                else if(dfsVis[it]==1){
                    return true;
                }
        }
        dfsVis[node]=0;
        return false;
    }
    public boolean IsCycle(int n, ArrayList<ArrayList<Integer>>adj){
        int []vis=new int[n];
        int []dfsVis=new int[n];
        for (int i = 0; i <n ; i++) {
            if(vis[i]==0){
                if(CheckCycle(i, adj, vis, dfsVis)){
                    return true;
                }
            }
        }
        return false;
    }

// Topological sorting by dfs
    private void findTopoSort(int node, int []vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer>st){
        vis[node]=1;
        for (Integer it:adj.get(node)){
            if(vis[it]==0){
                findTopoSort(it, vis, adj, st);
            }
        }
        st.push(node);
    }
    public int[] topoSort(int n, ArrayList<ArrayList<Integer>>adj){
        Stack<Integer> st=new Stack<>();
        int []vis=new int[n];
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
            System.out.println("Press 5 -> Cycle Detection in Undirected Graph using DFS");
            System.out.println("Press 6 -> Bipartite Graph or Graph Coloring ");
            System.out.println("Press 7 -> Check Cycle for Directed Graph");
            System.out.println("Press 8 -> For Topological sorting by dfs");
            System.out.println("Press 9 -> Exit");
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
                case 6->{
                    System.out.println("Bipartite Graph or Graph Coloring");
                    if(g.checkBipartite(adj ,v)){
                        System.out.println("Yes Bipartite");
                    }
                    else{
                        System.out.println("Not Bipartite");
                    }
                }
                case 7->{
                    System.out.println("Check Cycle for Directed Graph");
                    System.out.println(g.IsCycle(v, adj));
                }
                case 8->{
                    System.out.println("Topological Sorting by dfs");
                    System.out.println(Arrays.toString(g.topoSort(v, adj)));
                }
                case 9-> {
                    System.out.println("Thanks");
                    System.exit(0);
                }
            }
        }
    }
}
