import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by i_amg on 19-05-2017.
 */
class Count{

    public int count(int n, int[] arr){
        if(n == 0) return 1;
        else if(n < 0) return 0;
        else if(arr[n] > -1){
            return arr[n];
        } else{

            arr[n] = count(n - 1, arr) + count(n - 2, arr) + count(n - 3, arr);
            return arr[n];

        }

    }
}
public class TripleStep
{
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        Count obj = new Count();
        System.out.println(obj.count(n, arr));
    }
}
