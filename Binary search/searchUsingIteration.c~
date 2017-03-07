#include <stdio.h>
#include <stdbool.h>
bool binary(int* arr, int l, int r, int e)
{
    while(l <= r)
    {
        int mid = (l + r)/2;
        if(arr[mid] == e)
        return true;

        if(arr[mid] < e)
        {
            l = mid + 1;
        }
        else
        {
            r = mid - 1;
        }
    }

    return false;
}
int main()
{
    int arr[] = {2, 4, 6, 12, 23, 34, 55};
    int n = sizeof(arr)/sizeof(arr[0]);
    int e = 6;
    if(binary(arr, 0, n - 1, e))
    {
        printf("Yes");
    }

    else
    {
        printf("No");
    }
}
