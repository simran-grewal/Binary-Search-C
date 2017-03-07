#include <stdio.h>
#include <string.h>
#include <stdlib.h>
void Reverse(char *str)
{
    int l = strlen(str);
    
    
    char *first = str;
    char *last = first + l - 1;
    while(last > first)
    {
        char temp;
        temp = *first;
        *first = *last;
        *last = temp;
        
       first++;
       last--;    
    }

    printf("%s", str);
}
int main()
{
    char str[] = "Grewal";
    Reverse(str);
    
}
