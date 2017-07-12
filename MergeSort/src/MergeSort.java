/**
 * Created by i_amg on 24-05-2017.
 */
/**
 * Created by i_amg on 06-04-2017.
 */
class Merge{

    void Merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i < n1; i++){

            arr1[i] = arr[l + i];
        }

        for(int j = 0; j < n2; j++){
            arr2[j] = arr[mid + 1 + j];
        }


        int k = l, i = 0, j = 0;

        while(i < n1 && j < n2){

            if(arr1[i] < arr2[j]){

                arr[k] = arr1[i];
                i++;
            }

            else
            {
                arr[k] = arr2[j];
                j++;
            }

            k++;
        }


        while (i < n1){
            arr[k++] = arr1[i++];
        }

        while (j < n2){
            arr[k++] = arr2[j++];
        }


    }

    public void MergeSrt(int[] arr, int l, int h){

        if(l < h){

            int mid = (l + h)/2;
            MergeSrt(arr, l, mid);
            MergeSrt(arr, mid + 1, h);
            Merge(arr, l, mid, h);
        }
    }
}
public class MergeSort
{
    public static void main(String[] args) {

        int[] arr = {5, 1, 3, 9, 2, 6, 4};

        Merge obj   = new Merge();

        obj.MergeSrt(arr, 0, arr.length - 1);

        for(int i : arr){
            System.out.println(i);
        }
    }
}

