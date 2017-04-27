package MergeSort;

/**
 * Created by i_amg on 09-04-2017.
 */
class MergeSort{

    public void MergeTheSort(int[] arr, int l, int mid, int r){

        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i < n1; i++){
            arr1[i] = arr[l + i];
        }

        for(int i = 0; i < n2; i++){
            arr2[i] = arr[mid + 1 + i];
        }

        int k = l, j = 0, i  = 0;

        while (i < n1 && j < n2){

            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i];
                i++;
            }else{

                arr[k++] = arr2[j];
                j++;
            }
        }


        while (i < n1){
            arr[k++] = arr1[i++];
        }

        while (j < n2){
            arr[k++] = arr2[j++];
        }
    }
    public void Merge(int[] arr, int l, int h){

        if(l < h){

            int mid = (l + h)/2;

            Merge(arr, l, mid);
            Merge(arr, mid + 1, h);
            MergeTheSort(arr, l, mid, h);
        }
    }
}
public class Merge
{
    public static void main(String[] args)
    {
        int[] arr = {12, 11, 13, 5, 6, 7};

        MergeSort obj = new MergeSort();
        obj.Merge(arr, 0, arr.length - 1);

        for(int i : arr){
            System.out.println(i);
        }

    }
}
