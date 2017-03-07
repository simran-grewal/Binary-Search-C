#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
bool check(char *str, int l);
char open(char x);
int main()
{
    char *br;    
    br = malloc(40 * sizeof(char));
    scanf("%s", br);
    int l = strlen(br);
    bool c = check(br, l);

    if(c == true)
    printf("Brackets are Balanced");
    else
    printf("Brackets are not Balanced");
}

bool check(char *str, int l)
{
    int i;
    for(i = 0; i < l; i++)
    {   
        if(str[i] == '{' || str[i] == '[' || str[i] == '(')
        {
            push(str[i]);
        }

        else if(pop() != open(str[i]))
        {
            return false;   
        }
    }

    if(strlen(str) == 0)
    {
        return true;
    }
    
    
}

char open(char x)
{
    if(x == '}')
    return '{';
    if(x == ']')
    return '}';
    if(x == '(')
    return '(';
}
