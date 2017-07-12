/**
 * Created by i_amg on 04-05-2017.
 */
public class PrintSpiral
{
    public static void main(String[] args)
    {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int N = arr.length;
        int i,j,k;
        for(i=N-1, j=0; i>j; i--, j++)
        {
            //print top row
            for(k=j; k<i; k++) System.out.print(arr[j][k] + " ");
            //print last column
            for(k=j; k<i; k++) System.out.print(arr[k][i] + " ");
            //print last row
            for(k=i; k>j; k--) System.out.print(arr[i][k] + " ");
            //print first column
            for(k=i; k>j; k--) System.out.print(arr[k][j] + " ");

        }
        //if odd size matrix print the middle value
        int middle = (N-1)/2;
        if (N% 2 == 1) System.out.println(arr[middle][middle]);

    }
}
