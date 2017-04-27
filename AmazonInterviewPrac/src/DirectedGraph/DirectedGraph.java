package DirectedGraph;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by i_amg on 09-04-2017.
 */
class Graph{

    LinkedList<Integer>[] adjList;
    int V;
    int E;
    public Graph(int v){
        this.V = v;
        adjList = new LinkedList[this.V];

        for(int i = 0; i < this.V; i++){
            adjList[i] = new LinkedList<Integer>();
        }

        this.E= 0;
    }

    public void addEdge(int v, int w){

        adjList[v].add(w);
        this.E++;
    }

    public Stack<Integer> topologicalSort(){
        Stack<Integer> stack = new Stack<Integer>();

        boolean[] Visited = new boolean[this.V];

        for(int i = 0; i < this.V; i++){
            if(!Visited[i]){
                DFS(Visited, i, stack);
            }
        }

        return stack;
    }


    private void DFS(boolean[] Visited, int i, Stack<Integer> stack){
        Visited[i] = true;

        for(int w : adjList[i]){

            if(!Visited[w]){

                DFS(Visited, w, stack);
            }
        }

        stack.push(i);
    }

}
public class DirectedGraph
{
    public static void main(String[] args)
    {
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        Stack<Integer> stack = g.topologicalSort();
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
