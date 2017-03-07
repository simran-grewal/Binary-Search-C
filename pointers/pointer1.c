#include <stdio.h>
#include <stdlib.h>
int * allocate(int *arr, int n, int m)
{
    arr = (int *)malloc(10 * sizeof(int));
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;

   return arr; 

}
int main()
{
    int *arr;
    int n = 5;
    int m = 2;
   int *arr1 = allocate(arr, n, m);
      int i;
    for(i = 0; i < n; i++)
    {
        printf(" %d " ,arr1[i]);
    }   
}
