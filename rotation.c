#include <stdio.h>
void reverse(int *arr, int a, int b)
{
    int i, j;

    for(i = a, j = b - 1; i < j; i++, j--)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    int n = *(&arr + 1) - arr;
    int n =  arr;
    printf("%d", n);       
    int n = sizeof(arr)/sizeof(arr[0]);
    int d = 5;
    d = n - d + 1;
   reverse(arr, 0, d - 1);
    reverse(arr, d , n);
    reverse(arr, 0, n);
    int i;
    for(i = 0; i < n; i++)
    {
        printf(" %d ", arr[i]);
    }
}
