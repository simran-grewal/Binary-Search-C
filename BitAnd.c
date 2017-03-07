
#include <stdio.h>
int BitAnd(int x, int y)
{
    // AND using ~ | operator

    return (~((~x)|(~y)));
}

int BitOr(int x, int y)
{
    //OR using & ~ operator

    return (~((~x) & (~y)));
}

int Xor(int a, int b)
{
    // xor using & ~ operator

    return  ~((~((~a) & b))  &  ( ~ ((~b) & a ) ) );
}
int main()
{
    int x;
    int y;
    scanf("%d%d", &x, &y);
   
    printf("%d\n", BitAnd(x, y));

    printf("%d\n", BitOr(x, y));
    
    printf("%d\n", x ^ y);
    printf("%d\n", Xor(x, y) );  
}
