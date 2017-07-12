/**
 * Created by i_amg on 03-05-2017.
 */

class PrintDiagonal {

    public void print(int[][] matrix){

        for(int k = 0; k < matrix.length; k++){
            for(int row = k, col = 0; row >= 0 && col < matrix[0].length; row--, col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        for(int k = 1; k < matrix[0].length; k++){
            for (int row = matrix.length - 1,col = k; row >= 0 && col < matrix[0].length; row--,col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


}
public class PrintMatrixDiagonally
{
    public static void main(String[] args)
    {
        int row = 4, col = 5;
        int k = 1;
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = k++;
            }
        }

        PrintDiagonal obj = new PrintDiagonal();
        obj.print(matrix);
    }
}
