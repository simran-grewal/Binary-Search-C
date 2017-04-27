package Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by i_amg on 08-04-2017.
 */
class MyGraph{

    LinkedList<Integer>[] adjList;
    int V, E;

    public MyGraph(int v){
        this.V = v;

        adjList = new LinkedList[this.V];

        for(int i = 0; i < this.V; i++){
            adjList[i] = new LinkedList<Integer>();
        }

        this.E = 0;

    }

    public void add_edge(int w, int v){
        adjList[v].add(w);
        adjList[w].add(v);
        this.E++;
    }

    public void DFS(){

        boolean[] Visited = new boolean[this.V];

        for(int i = 0; i < this.V; i++){
            if(!Visited[i]){
                DFS(Visited, i);
            }
        }
    }

    private void DFS(boolean[] Visited, int v){

        Visited[v] = true;
        System.out.println(v);

        for(int w : adjList[v]){

            if(!Visited[w]){
                DFS(Visited, w);
            }
        }
    }

    public void BFS(){

        boolean[] Visited = new boolean[this.V];

        for(int i = 0; i < this.V; i++){
            if(!Visited[i])
            BFS(Visited, i);
        }
    }

    public void BFS(boolean[] Visited, int v){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        Visited[v] = true;
        while (!queue.isEmpty()){

            int value = queue.poll();

            System.out.println(value);

            for(int w : adjList[value]){

                if(!Visited[w]){
                    Visited[w] = true;
                    queue.add(w);
                }
            }
        }
    }

    public int[] connectedComponents(){

        boolean[] Visited = new boolean[this.V];
        int[] arr = new int[this.V];

        int count = 0;
        for(int i = 0; i < this.V; i++){
            if(!Visited[i]){
                connectedComponents(Visited, arr, count, i);
                count++;
            }
        }

        return arr ;
    }

    private void connectedComponents(boolean[] Visited, int[] arr, int count, int i){

        Visited[i] = true;

        arr[i] = count;

        for(int w : adjList[i]){

            if(!Visited[w]){
                connectedComponents(Visited, arr, count, w);
            }
        }
    }

    public boolean hasCycle(){
        boolean[] Visited = new boolean[this.V];
        boolean[] hasCycle = new boolean[1];
        hasCycle[0] = false;

         for(int i = 0; i < this.V; i++){
            if(!Visited[i])
            hasCycle(Visited, hasCycle, 0, -1);
         }

        return hasCycle[0];
    }

    public void hasCycle(boolean[] Visited, boolean[] hasCycle, int i, int parent){
        Visited[i] = true;

        for(int w : adjList[i]){
            if(!Visited[w]){
                hasCycle(Visited, hasCycle, w, i);
            }else if(i > 0 && w != parent){
                hasCycle[0] = true;
                break;
            }
        }
    }

}
public class Graph
{
    public static void main(String[] args) {

        MyGraph graph = new MyGraph(6);
        graph.add_edge(0,2);
        graph.add_edge(2,1);
        graph.add_edge(2,3);
        graph.add_edge(3,1);
        graph.add_edge(4,5);
        graph.add_edge(4,5);

        //graph.DFS();
        //graph.BFS();
//        int[] arr = graph.connectedComponents();
//
//        for(int i : arr){
//            System.out.println(i);
//        }

//        System.out.println(graph.hasCycle());

    }
}
