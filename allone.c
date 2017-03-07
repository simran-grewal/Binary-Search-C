#include <stdio.h>
#include <math.h>
void conver(int n)
{
    int num = n;
    int r;
    int bin = 0;
  int  i = 0;
    while(n)
    {
        r = n % 10;
        bin = bin + r*pow(2, i);
        n /= 2;
        i++;
    }

    printf("%d", bin);
}
int main()
{
    int n;
    scanf("%d", &n);
    
    //convert(n);
    
    printf("%d", pow(2, n));
    
    return 0;
}
