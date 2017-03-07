#include <stdio.h>
int find(int arr[],int);
int main()
{
    int arr[]={2,3,4};
    int size=3;
        int i;
    for(i = 0; i < size; i++)
    {
        int pro = find(arr,size);
        arr[i]=pro;        
    }

    for(i = 0; i < size; i++)
    {
        printf("%d\n", arr[i]);
    }
}

int find(int arr[],int size)
{
    int p=1,j; 
    for(j = 0; j < size; j++)
    {
        p*=arr[j];    
    }

    return p;
}
