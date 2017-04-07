/**
 * Created by i_amg on 07-04-2017.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Cycle{

    int V,E;
    LinkedList<Integer>[] adjList;

    Cycle(int v){
        this.V = v;

        adjList = new LinkedList[this.V];

        for(int i = 0; i < this.V; i++){

            adjList[i] = new LinkedList<Integer>();


        }

        this.E   = 0;

    }


    public void add_Edge(int v, int w){

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

    public void DFS(boolean[] Visited, int v){

        System.out.println(v);
        Visited[v] = true;

        for (int w : adjList[v]){

            if(!Visited[w]){
                DFS(Visited, w);
            }
        }
    }


    public void BFS(){
        boolean[] Visited = new boolean[this.V];

        for(int i = 0; i < this.V; i++){
            if(!Visited[i]){
                BFS(Visited, i);
            }
        }
    }

    public void BFS(boolean[] Visited, int v){

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        Visited[v] = true;

        while (!queue.isEmpty()){

            Integer w = queue.poll();
            System.out.println(w);

            for(int s : adjList[w]){

                if(!Visited[s]){

                    Visited[s] = true;
                    queue.add(s);
                }
            }

        }
    }

}
public class FindCycleInGraph
{
    public static void main(String[] args) {

        Cycle g = new Cycle(6);

        g.add_Edge(0,2);
        g.add_Edge(2,1);
        g.add_Edge(2,3);
        g.add_Edge(3,1);
        g.add_Edge(4,5);

        System.out.println("------it is DFS----------");
        g.DFS();
        System.out.println("----------it is BFS-----------");
        g.BFS();
    }
}
