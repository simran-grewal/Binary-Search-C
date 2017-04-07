import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by i_amg on 04-04-2017.
 */
class NoOfClustor{

    int[] ofSet = {-1, 0, 1};

    private boolean NeighBourExist(int[][] Matrix, int i, int j ){

        if(i >= 0 && i < Matrix.length && j >= 0 && j < Matrix[0].length){
            if(Matrix[i][j] == 1){
                return true;
            }
        }

        return false;
    }

    private void DoDFS(int[][] Matrix, boolean[][] Visited, int i, int j, int[]  c){

        if(Visited[i][j]){
            return;
        }

        Visited[i][j] = true;
        c[0] = c[0] + 1;
        int XofSet, YofSet;
        for(int x = 0; x < ofSet.length; x++){

            XofSet = ofSet[x];

            for(int y = 0; y < ofSet.length; y++){

                YofSet = ofSet[y];


                if(XofSet == 0 && YofSet == 0){
                    continue;
                }

                if(NeighBourExist(Matrix, i + XofSet, j + YofSet)){
                    DoDFS(Matrix, Visited, i + XofSet, j + YofSet, c);
                }

            }
        }
    }


    public void FindNoOfClustor(int[][] Matrix){

        int Count = 0;
        int res = Integer.MIN_VALUE;
        boolean[][] Visited = new boolean[Matrix.length][Matrix[0].length];
        for(int i = 0; i < Matrix.length; i++){

            for(int j = 0; j < Matrix[0].length; j++){

                int[] c = new int[1];
                if(!Visited[i][j] && Matrix[i][j] == 1){

                        Count++;
                    DoDFS(Matrix, Visited, i, j, c);
                }

                res = Integer.max(res, c[0]);
            }
        }


        System.out.println("Total no of Cluster = " + Count +"  and Largest Cluster Size is = " + res);
    }

}
public class Cluster
{
    public static void main(String[] args) {

        int[][] Matrix = {
                {1, 0, 1, 0, 1, 0, 1},
                {1, 1, 0, 1, 0, 1, 1},
                {0, 1, 0, 1, 1, 0, 1},

        };


        NoOfClustor obj = new NoOfClustor();
        obj.FindNoOfClustor(Matrix);
    }
}
