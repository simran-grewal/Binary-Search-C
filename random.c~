//# include<stdlib.h>
#include <stdio.h>
void swap(int *arr, int a, int b);
void quicksort(int *arr, int l, int r);
int chosepivot(int left, int right)
{
    int r =rand() % (right - left + 1);
    return left + r;
}

void quicksort(int *a, int left, int right)
{
    if(left >= right) return;

    int pivot = chosepivot(left, right);
    swap(a, left, pivot);
    int last = left, i;
    for(i = left + 1; i <= right; i++)
    {
        if(a[i] < a[left])
        {
            swap(a, i, ++last);        
        }
    }    

    swap(a, left, last);
    quicksort(a, left, last - 1);
    quicksort(a, last + 1, right);
}
void swap(int *arr, int a, int b)
{
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;    
}
int main()
{
    
    int arr[] = {9, 7, 3, 8, 5, 6};
    int n = sizeof(arr)/sizeof(arr[0]);

    quicksort(arr, 0, n - 1);
  
    int i;
    for(i = 0; i < n; i++)
        printf("%d ", arr[i]);   
}
