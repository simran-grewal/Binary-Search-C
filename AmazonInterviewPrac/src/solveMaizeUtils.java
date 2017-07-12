/**
 * Created by i_amg on 08-04-2017.
 */
class Solve{

    public boolean IsSafe(int[][] maize, int x, int y){
        if(x >= 0 && x < maize.length && y >= 0 && y < maize[0].length){
            if(maize[x][y] == 1){
                return true;
            }
        }
        return false;
    }
    public boolean solveMaize(int[][] maize, int x, int y, int[][] sol){

        if(x ==  maize.length - 1 && y == maize[0].length - 1){

            sol[x][y] = 1;
            return true;
        }

        if(IsSafe(maize, x, y)){

            sol[x][y] = 1;
            if(solveMaize(maize, x + 1, y, sol)){
                return true;
            }

            if(solveMaize(maize, x, y + 1, sol)){
                return true;
            }

            sol[x][y] = 0;
            return false;
        }

        return false;
    }
}
public class solveMaizeUtils
{
    public static void main(String[] args) {
        int[][] maze  =  {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 0, 1, 1 },
                {1, 0, 1, 1}
        };


        int[][] sol = new int[maze.length][maze[0].length];

        Solve obj = new Solve();
        if(obj.solveMaize(maze, 0, 0, sol)){

           for(int i  =0; i < maze.length; i++){
               for(int j = 0; j < maze[0].length; j++){
                   System.out.print(sol[i][j]);
               }

               System.out.println();
           }
        }

    }
}
