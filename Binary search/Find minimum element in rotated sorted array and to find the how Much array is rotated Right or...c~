#include <stdio.h>
#include <stdbool.h>
int count(int *arr, int n)
{
    int low = 0, high = n - 1;
    while(low <= high)
    {
        if(arr[low] <= arr[high])
        return low;

        int mid = (low + high)/2;
        int next = (mid + 1)%n;
        int prev = (mid + n - 1)%n;
        
        if(arr[mid] <= arr[next] && arr[mid] <= arr[prev])
        {
            return mid;           
        }

        else
        if(arr[mid] <= arr[high])
        {
            high = mid - 1;
        }
        else
        if(arr[mid] >= arr[low])
        {
            low = mid + 1;
        }
    }

    return -1;
    
}
int main()
{
    int arr[] = {11, 12, 15, 18, 1, 5, 6, 8};
    int n = sizeof(arr)/sizeof(arr[0]);
    printf("\n%d", arr[count(arr, n)]); // This is to find minimum element in sorted array.
    printf("\n%d", count(arr, n)); // this is to find how many time Array is rotated .
}
