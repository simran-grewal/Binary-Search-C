/**
 * Created by i_amg on 07-04-2017.
 */

class MageUtils{

    public void solve(int[][] Matrix, int x, int y, int[][] sol){

        if(x == Matrix.length - 1 && y == Matrix.length - 1){

        }
    }

}
public class NQueen
{
    public static void main(String[] args) {

        int[][] Matrix = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 0},
                {1, 0, 0, 1, 0},
                {0, 1, 0, 1, 1},
                {0, 0, 0, 0, 1}
        };


        int[][] sol = new int[Matrix.length][Matrix.length];

        MageUtils mageUtils = new MageUtils();

            mageUtils.solve(Matrix, 0, 0, sol);
    }

}

