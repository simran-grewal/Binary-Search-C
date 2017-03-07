/* Q Unsorted array a[n] , given int x find a pair in a[n] having sum closest to x     */

#include <stdio.h>
#include <math.h>
#define INT_MAX 100000;
int main()
{
    int arr[] = {10, 20, 30, 32,  60};
    int n = sizeof(arr)/sizeof(arr[0]);
    int i, j;
    int x = 53;
    int close;
    int diff = INT_MAX;
    int a, b;
    for(i = 0, j = n - 1; i < j;)
    {
        if(abs(arr[i] + arr[j] - x) < diff)
        {
            a = arr[i];
            b = arr[j];
            diff = abs((a + b) - x);
            j--;
        }     
        if((arr[i] + arr[j]) > x)
        j--;

        else
        i++;
    }

    printf("%d%d", a, b);
}
