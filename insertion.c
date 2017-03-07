#include<stdio.h>
void sort(int arr[], int n);
int main()
{
    int arr[] = {12, 11, 13, 5, 6};
    int n = sizeof(arr)/sizeof(arr[0]);    
    sort(arr, n);
    int i;
    for(i = 0; i < n; i++)
    {
        printf("%d \n", arr[i]);
    }

}

void sort(int arr[], int n)
{
    int i;
    for(i = 1; i < n; i++)
    {
    int j = i - 1;
    int key = arr[i];

        while(j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }
}
