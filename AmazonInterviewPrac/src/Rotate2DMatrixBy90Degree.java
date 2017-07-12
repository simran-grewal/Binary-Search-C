/**
 * Created by i_amg on 19-04-2017.
 */
public class Rotate2DMatrixBy90Degree
{
    public static int[][] RotateMatrix(int[][] matrix, int n){
        int[][] ret = new int[n] [n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                ret[i][ j] = matrix[j][ n - i - 1];
            }
        }

        return ret;
    }
    public static void main(String[] args) {

        int[][] arr = {
            { 1,2,3,4 },
            { 5,6,7,8 },
            { 9,0,1,2 },
            { 3,4,5,6 }
        };

        arr = RotateMatrix(arr, 4);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }

    }
}
