#include<stdio.h>
#include<stdlib.h>
char buffer[1000];
static char *curr = buffer;
void *myalloc(int x)
{
    if((curr + x) > (buffer + 1000))
    printf("Error\n");

    else
    {
        char *t = curr;
        curr += x;
        return t;
    }
}

int main()
{
    char *s = myalloc(20);
}
