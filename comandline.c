#include <stdio.h>
int main(int argc, char * argv[])
{
    int i = 1;
    int x;
    int sum = 0;
    while(i < argc)
    {
        sscanf(argv[i], "%d", &x);
        sum += x;    
        i++; 
    }

    printf("%d\n", argc);
    printf("%d", sum);
    
}
