import java.util.ArrayList;

/**
 * Created by i_amg on 04-05-2017.
 */
class CountMe{
    public boolean IsValid(int x, int y, int[][] maze){
        if(x < 0 || y < 0 || x >= maze.length || y >= maze[0].length){
            return false;
        }

        return true;
    }
    public void Count(int[][] maze, boolean[][] Visited, int[] count, int x, int y){

        if(x == maze.length - 1 && y == maze[0].length - 1){
           count[0] += 1;
            return;
        }

        Visited[x][y] = true;
        if(IsValid(x, y, maze) && maze[x][y] == 1){
            if(!Visited[x + 1][y] && IsValid(x + 1, y, maze)){
                Count(maze, Visited, count, x + 1, y);
            }

            if(!Visited[x][y + 1] && IsValid(x, y + 1, maze)){
                Count(maze, Visited, count, x, y + 1);
            }

            if(!Visited[x - 1][y] && IsValid(x - 1, y, maze)){
                Count(maze, Visited, count, x - 1, y);
            }

            if(!Visited[x][y - 1] && IsValid(x, y - 1, maze)){
                Count(maze, Visited, count, x, y - 1);
            }
        }

        Visited[x][y] = false;

    }
}
public class CountNoOfPathInMatrix
{
    public static void main(String[] args) {
        int[][] maze =
        {
            { 1, 1, 1, 1 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 1 },
            { 1, 1, 1, 1 }
        };

        int[] count  = new int[1];
        boolean[][] Visited = new boolean[maze.length][maze[0].length];
        CountMe obj = new CountMe();

        //obj.Count(maze, Visited, count, 0, 0);

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < 3; i++){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j = 0; j < 3; j++){
                arr.add(1);
            }

            arrayLists.add(arr);
        }



        System.out.println(arrayLists.get(0).get(2));
    }


}
