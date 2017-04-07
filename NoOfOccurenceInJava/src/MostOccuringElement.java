import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by i_amg on 25-03-2017.
 */
class Heap{
    int[] arr = new int[30];
    int N = 0;

    public void Insert(int i){
        arr[++N] = i;
        Swim(N);
    }

    public void Swim(int  i){
        if(i <= 1){
            return;
        }

        if(arr[i/2] < arr[i]){
            swap(i/2, i);
            Swim(i/2);
        }
    }

    public void Sink(int i){
        int max = i, l = 2 * i, r = (2 * i) + 1;

        if(l <= N && arr[l] > arr[max]){
            max = l;
        }

        if(r <= N && arr[r] > arr[max]){
            max = r;
        }

        if(max != i){
            swap(max, i);
            Sink(max);
        }
    }

    void DeleteMaximum(){
        int res = arr[1];
            swap(1, N);
            N--;
            Sink(1);
        System.out.println(res + "is Deleted");
    }
    public void Sort(){

        for(int i = N/2; i >= 1; i--){
            Sink(i);
        }
        while (N > 1){
            DeleteMaximum();
        }

        int[] a1  = arr;
        for(int i : a1){
            System.out.println(i);
        }
    }
    public void swap(int a, int b){
        int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
    }

    public void Print(){
        for(int i = 1; i <= N; i++){
            System.out.println(arr[i]);
        }
    }
}
public class MostOccuringElement
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int j = 0; j < n; j++){
            int k = sc.nextInt();
            int res = 0;
            for(int i = 0; i <32; i++){

                if((k & (1 << i)) != 0)
                {
                    res |= 1 << (31 - i);
                }
            }


            System.out.println(res);
        }
    }
}
