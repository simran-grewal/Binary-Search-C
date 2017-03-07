#include <stdio.h>
#include <stdbool.h>
int binary(int* arr, int l, int r, int e)
{
    int result = -1;
    while(l <= r)
    {
        int mid = (l + r)/2;
        if(arr[mid] == e)
        {
            result = mid;
            r = mid - 1;
        }

        else 
        if(arr[mid] < e)
        {
            l = mid + 1;
        }        
        
        else
        r = mid - 1;
    }

    return result;
}
int main()
{
    int arr[] = {2, 4, 6, 6, 6 ,6, 6, 23, 34, 55};
    int n = sizeof(arr)/sizeof(arr[0]);
    int e = 6;
    printf("%d", binary(arr, 0, n - 1, e));
    
    
}
