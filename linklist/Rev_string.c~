#include <stdio.h>
#include <stdlib.h>
char stack[10];
int top = -1;
void rev(char *str)
{
    
    while(*str)
    {
        push(*str);
        str++;;
    }
 
    
    while(stack[top] != '\0')
    {
        printf("%c", stack[top]);
        top--;
    }
    printf("\n");   
}

void push(char str)
{
    stack[++top] = str;
}
int main()
{
    char *str = "simran";
        
      
    rev(str);
    
    
}
