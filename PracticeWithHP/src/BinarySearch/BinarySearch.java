package BinarySearch;

/**
 * Created by i_amg on 28-06-2017.
 */
class Search {
    public int findElement(int[] arr, int l, int r, int element) {
        if(l > r) {
            return -1;
        }

        int mid = (l + r)/2;
        if(arr[mid] == element) {
            System.out.println("Element Found");
            return arr[mid];
        }
        else if(arr[mid] > element) {
           return findElement(arr, l, mid - 1, element);
        } else if(arr[mid] < element) {
            return findElement(arr, mid + 1, r, element);
        }

        return -1;
    }
}
public class BinarySearch
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 11, 14, 17};
        Search search = new Search();
        int number = search.findElement(arr, 0, arr.length - 1, 16);
        System.out.println(number);
    }
}
