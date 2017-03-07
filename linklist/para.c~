#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
struct stack
{
    int capacity;
    int top;
    char *arr;
};
struct stack* Create_stack(int l)
{
    struct stack* s = (struct stack*)malloc(sizeof(struct stack));
    s->capacity = l;
    s->top = - 1;
    s->arr = malloc(l * sizeof(char));
    return s;
}

bool check(struct stack* s, char *str)
{
    while(*str)
    {
        if(*str == '{' || *str == '[' || *str == '(')
        {
            push(s, *str);
        }
        
        else
        
        {
            if(pop(s) != Open_of(*str))
            {
                printf("\nNot Balanced");
                break;                                    
            }
        }

        return strlen(str) == 0;   
    }
}

void push(struct stack* s, char str)
{
    s->arr[++s->top] = str;
}

char pop(struct stack* s)
{
   return s->arr[s->top--];
}

char Open_of(char str)
{
    if(str == '}') return '{';
    if(str == ')') return '(';

    return '[';
}
int main()
{
    char *str;
    str = malloc(10 * sizeof(char));
    gets(str);
    struct stack *s = Create_stack(strlen(str));
    if(check(s, str))
    {
        printf("\nBalanced");
    }
}


