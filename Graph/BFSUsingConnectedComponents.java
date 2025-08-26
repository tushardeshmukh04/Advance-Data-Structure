package Graph;
import java.util.*;
public class BFSUsingConnectedComponents {
    static class Edge {
        int src;
        int dest;
        int wt;
        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph ){
        for(int i = 0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[6].add(new Edge(6,7,1));

        graph[7].add(new Edge(7,6,1));

        graph[9].add(new Edge(9,9,1));
    }
    public static void bfs(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                bfsUtil(graph, vis, i);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] vis, int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if (!vis[curr]){
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 10;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
    }
}
