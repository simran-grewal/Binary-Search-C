/**
 * Created by i_amg on 23-04-2017.
 */

class Sort{

    public void qSort(int[] arr, int l, int r){

        if(l >= r){
            return;
        }

        int last = l;


        for(int i = l + 1; i < r; i++){

            if(arr[i] < arr[l]){
                last++;

                int temp = arr[i];
                arr[i] = arr[last];
                arr[last] = temp;

            }
        }


        int temp = arr[l];
            arr[l] = arr[last];
            arr[last] = temp;

            qSort(arr, l, last - 1);
            qSort(arr, last + 1, r);
    }
}
public class QuickSort
{
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 9};

        Sort sort = new Sort();
        sort.qSort(arr, 0, arr.length - 1);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
