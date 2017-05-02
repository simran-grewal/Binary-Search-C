/**
 * Created by i_amg on 29-04-2017.
 */
public class NQueenProblem
{

    class Position{

        int row, col;

        Position(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    public Position[] solveNQ(int n){
        Position[] positions = new Position[n];
        boolean sol = solveNQSolution(n, 0, positions);

        if(sol){
            return positions;
        }else{
            return new Position[0];
        }
    }

    public boolean solveNQSolution(int n, int row, Position[] positions){

        if(n == row){
            return true;
        }

        for(int col = 0; col < n; col++){
            boolean isSafe = true;

            for(int queen = 0; queen < row; queen++){
                if(positions[queen].col == col || positions[queen].row - positions[queen].col == row - col || positions[queen].row + positions[queen].col ==
                        row + col){

                    isSafe = false;
                    break;
                }
            }

            if(isSafe){
                positions[row] = new Position(row, col);

                if(solveNQSolution(n, row + 1, positions)){
                    return true;
                }
            }
        }

        return false;

    }





    public static void main(String[] args) {

        NQueenProblem nQueenProblem = new NQueenProblem();
       Position[] arr =  nQueenProblem.solveNQ(4);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].row + "  " + arr[i].col);
        }



    }
}
