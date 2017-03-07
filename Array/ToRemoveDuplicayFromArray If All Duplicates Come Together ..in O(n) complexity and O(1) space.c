#include <stdio.h>
void Count(int *arr, int n)
{
    int prev = 0;
    int i;
    
    for(i = 0; i < n; i++)
    {
        if(arr[i] != arr[prev])
        {
           
            arr[++prev] = arr[i];
            
        }
    }

    n = prev + 1;
    for(i = 0; i < n; i++)

    printf(" %d", arr[i]);
}
int main()
{
    int arr[] = {8, 8, 8, 2, 2, 3, 3, 4, 5, 5};
    int n = sizeof(arr)/sizeof(arr[0]);
    Count(arr, n);
}
