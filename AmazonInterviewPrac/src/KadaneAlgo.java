/**
 * Created by i_amg on 02-05-2017.
 */
class FindMaxSum{
    public int MaxSum(int[] arr){

        int curr = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){

            curr = curr + arr[i];

            if(curr > max){
                max = curr;
            }
            if(curr < 0) {
                curr = 0;
            }
        }


        return max;
    }
}
public class KadaneAlgo
{
    public static void main(String[] args) {
        int[] input = {2, -9, 5, 1, -4, 6, 0, -7, 8};

        FindMaxSum obj = new FindMaxSum();
        System.out.println(obj.MaxSum(input));
    }
}
