#include<stdio.h>
#include<stdbool.h>
bool find(int *arr, int l, int r, int e)
{
    if(l > r)
    return 0;

    int mid = l + (r - l)/2;
    
    if(arr[mid] == e)
    return 1;

    if(arr[l] <= arr[mid])
    {
        if((e >= arr[l]) && (e <= arr[mid]))
        return find(arr, l, mid - 1, e);

        return find(arr, mid + 1, r, e);
    }

    else
    {
        if((e >= arr[mid]) && (e <= arr[r]))
        return find(arr, mid + 1, r, e);

        return find(arr, l, mid - 1, e);
    }
}
int main()
{
    int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
    int n = sizeof(arr)/sizeof(arr[0]);
    int e = 10;
    bool isfound = find(arr, 0, n - 1, e);
    
   !(isfound)?printf("No"):printf("Yes");
}
