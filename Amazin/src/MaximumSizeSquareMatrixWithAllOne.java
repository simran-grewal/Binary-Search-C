/**
 * Created by i_amg on 29-04-2017.
 */
class Find
{

    public int maxSize(int[][] matrix){

        int maxSize = 0;
        int[][] table = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == 0 || j == 0){
                    table[i][j] = matrix[i][j];
                    maxSize = Math.max(maxSize, table[i][j]);
                }
                else if(matrix[i][j] == 0){
                    table[i][j] = 0;
                } else{

                    int min = Math.min(table[i][j - 1], table[i - 1][j - 1]);

                    table[i][j] = Math.min(min, table[i -1][j]) + 1;

                    maxSize = Math.max(maxSize, table[i][j]);
                }
            }
        }


        return maxSize;
    }
}
public class MaximumSizeSquareMatrixWithAllOne
{
    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 0, 0, 1, 1 },
                { 0, 0, 1, 0, 1, 1 },
                { 1, 1, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1 },
                { 0, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 1, 1 }
        };

        Find find = new Find();
        System.out.println(find.maxSize(matrix));
    }
}
