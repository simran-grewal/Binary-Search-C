//Q-- unsorted array a[x] print all duplicate enteried in O(n) time and O(1) space 
//0 < n < 1000000
//    0 < e < n       --- e = value

// maximum accurence of a number  = 2
#include <stdio.h>
int main()
{
    int arr[] = {1, 2, 2, 8, 5, 7, 6, 8,5};
    int size = sizeof(arr)/sizeof(arr[0]);
    int i ;
    for(i = 0; i < size; i++)
    {
        if( (arr[abs(arr[i])])  <  0 )
        printf("%d   ", abs(arr[i]));
  
       else
    
       arr[abs(arr[i])]  *= -1;

    }
}
