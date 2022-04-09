package graph;

import java.util.*;
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
}
public class graphRepresentation {
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        graphs g=new graphs();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("press 1 -> AddEdge");
            System.out.println("Press 2 -> Print The Graph");
            System.out.println("Press 3 -> Bfs Of The Graph");
            System.out.println("Press 4 -> Exit");
            System.out.println("Enter the choice");
            int choice=sc.nextInt();
            switch (choice) {
                case 1 -> {
                    graphs.addEdge(adj, 0, 1);
                    graphs.addEdge(adj, 0, 4);
                    graphs.addEdge(adj, 1, 2);
                    graphs.addEdge(adj, 1, 3);
                    graphs.addEdge(adj, 1, 4);
                    graphs.addEdge(adj, 2, 3);
                    graphs.addEdge(adj, 3, 4);
                    System.out.println("Graph inserted...");
                }
                case 2 -> {
                    System.out.println("Your graph is");
                    graphs.printGraph(adj);
                }
                case 3 -> {
                    System.out.println("Bfs Of The Graphs");
                    System.out.println(g.bfsOfGraph(v, adj));
                }
                case 4 -> {
                    System.out.println("Thanks");
                    System.exit(0);
                }
            }
        }
    }
}
