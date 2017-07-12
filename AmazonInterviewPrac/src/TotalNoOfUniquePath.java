/**
 * Created by i_amg on 19-05-2017.
 */

class FindPath{

    public boolean IsSafe(int[][] maze, int x, int y){

        if(x < maze.length  && y < maze[0].length && maze[x][y] == 1 && x >= 0 && y >= 0){
            return true;
        }

        return false;
    }

    public void noOfPath(int[][] maze, int x, int y, boolean[][] Visited, int[] count){

        if(x == maze.length - 1 && y == maze[0].length - 1){
            count[0] += 1;
            return;
        }

        Visited[x][y] = true;

        if(IsSafe(maze, x, y)){
            System.out.println(x);
            System.out.println(y);
            if(!Visited[x + 1][y]){
                noOfPath(maze, x + 1, y, Visited, count);
            }

            if(!Visited[x - 1][y]){
                noOfPath(maze, x - 1, y, Visited, count);
            }

            if(!Visited[x][y + 1]){
                noOfPath(maze, x, y + 1, Visited, count);
            }

            if(!Visited[x][y - 1]){
                noOfPath(maze, x, y - 1, Visited, count);
            }



        }
        Visited[x][y] = false;


    }
}
public class TotalNoOfUniquePath
{
    public static void main(String[] args)
    {
        int[][] maze =   {
                { 1, 1, 1, 1 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 1 },
                { 1, 1, 1, 1 }
        };

        boolean[][] Visited = new boolean[maze.length][maze[0].length];
        FindPath obj = new FindPath();
        int[] count = new int[1];
        obj.noOfPath(maze, 0, 0, Visited, count);

        System.out.println(count[0]);
    }
}
