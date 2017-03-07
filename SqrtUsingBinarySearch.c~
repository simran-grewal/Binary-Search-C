#include <stdio.h>
#include <stdlib.h>
int FindSqr(int x)
{
    if(x == 0 || x == 1)
    return x;
    int start = 1;
    int end = x;
    int res;
    while(start <= end)
    {
        int mid = (start + end)/2;

        if(mid * mid == x)
        return mid;

        if(mid * mid < x)
        {
            start = mid + 1;
            res = mid;
        }

        else
        end = mid - 1;;
    }

    return res;
}
int main()
{
    int n = 25;
    int sqr = FindSqr(n);
    
    printf("%d", sqr);

}
