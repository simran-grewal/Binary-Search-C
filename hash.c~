#include<stdio.h>
#include<stdlib.h>

int main()
{
    int arr[] = { 9, 12, 23, 10, 12, 12, 15, 23,
                 14, 12, 15 };
    int n = sizeof(arr) / sizeof(arr[0]);
    
    int i,pos,_xor = 0;
    
    for(i = 0; i < n; i++)
    {
        pos = 1 << arr[i];
        _xor = _xor ^ pos;
    }

    printf("%d", _xor);
}
