/**
 * Created by i_amg on 04-04-2017.
 */
import java.util.LinkedList;
import java.util.Queue;

class GLL{

    LinkedList<Integer>[]  adjList;

    int v;
    int e;

    public GLL(int v){
        this.v = v;
        this.adjList = new LinkedList[this.v];
        for(int i = 0; i < this.v; i++){

            adjList[i] = new LinkedList<Integer>();

        }

        this.e = 0;
    }

    public void addEdge(int v, int w){

        adjList[v].add(w);
        adjList[w].add(v);
        this.e++;
    }

    public void DFS(int v){

        boolean[] Marked = new boolean[this.v];

        DFS(Marked, v);
    }

    public void DFS(boolean[] Marked, int v){

        Marked[v] = true;
        System.out.println(v);

        for (int w : adjList[v]){

            if(!Marked[w]){
                DFS(Marked, w);
            }
        }
    }



    public void BSF(int v){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        boolean[] Marked = new boolean[this.v];

        Marked[v] = true;

        while (!queue.isEmpty()){

            int value = queue.poll();

            System.out.println(value);

            for(int w : adjList[value]){

                if(!Marked[w]){
                    Marked[w] = true;
                    queue.add(w);
                }
            }
        }
    }

}
public class GraphAdjList
{

    public static void main(String[] args) {

        GLL adjList = new GLL(6);

        adjList.addEdge(4, 5);
        adjList.addEdge(0, 1);
        adjList.addEdge(0, 2);
        adjList.addEdge(1, 2);
        adjList.addEdge(2, 3);
        adjList.addEdge(3, 1);

        System.out.println("---------DFS of 0-----------------");
        adjList.DFS(0);

        System.out.println("-----------BFS of 0---------------");
        adjList.BSF(0);

    }

}
