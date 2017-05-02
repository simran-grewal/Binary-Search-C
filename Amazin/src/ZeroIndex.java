/**
 * Created by i_amg on 29-04-2017.
 */
public class ZeroIndex
{

    public static int FindIndex(int[] arr){
        int max_index = -1;
        int count = 0;
        int max_count = 0;
        int prev_zero_index = -1;
        int left = 0;
        int zero_index = -1;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 0){
                count++;
                prev_zero_index = i;
            }


            if(count == 2){
                while (arr[left] != 0)
                left++;

                left++;
                count = 1;
            }

            if(i - left + 1 > max_count){
                max_count = i - left + 1;
                zero_index = prev_zero_index;
            }



        }

        return zero_index;
    }
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 0, 1, 0, 1, 1 };
        int index = FindIndex(arr);
        System.out.println(index);
    }
}
