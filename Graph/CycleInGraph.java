package Graph;

import java.util.ArrayList;

public class CycleInGraph {
    static class Edge {
        int src;
        int dest;
        Edge(int s, int d){
            this.src=s;
            this.dest= d;
        }
    }
    public static void createGraph(ArrayList<
            Edge>[] graph ){
        for(int i = 0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[6].add(new Edge(6,7));
        graph[7].add(new Edge(7,6));



    }
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0; i< graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true; // cycle exist in 1 part
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            // case 3
            if(!vis[e.dest]){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
            }
            // case 1
            else if (vis[e.dest] && e.dest != par){
                return true;
            }
            // case 2 : do nothing -> continue
        }
        return false;
    }
    public static void main(String[] args) {
        int  V = 10;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
