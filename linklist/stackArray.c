#include <stdio.h>
#include <stdlib.h>
struct stack
{
    unsigned capacity;
    int top;
    int *arr;
};

      

struct stack * create(int capacity)
{  

    struct stack * s = (struct stack *)malloc(sizeof(struct stack)); 
    s->capacity = capacity;
    s->arr = (int *)malloc(capacity * sizeof(int));
    s->top = -1;
    return s;
}

int pop(struct stack *s)
{
    if(Is_empty(s))
    {
        printf("\nstack is Empty");        
        return;

    }
    
    else
    { 
        int value = s->arr[s->top--];
        return value;
    }
}
int Is_empty(struct stack *s)
{
    return s->top == -1;
}
void push(struct stack *s, int data)
{
    if(Is_full(s))
    {
        printf("\nStack is full");
        return;
    }
    s->arr[++s->top] = data;
    printf("\nPushed");
}
int Is_full(struct stack *s)
{
    return s->top == s->capacity - 1; 
}
int main()
{
   struct stack * s = create(2);
    push(s, 4);
    push(s, 6);
    push(s, 7);
    push(s, 8);
    printf("\n\n\n\n");
    printf("\n%d", pop(s));
    printf("\n%d", pop(s));
    printf("\n%d", pop(s));
    printf("\n%d", pop(s));
    printf("\n%d", pop(s));
    printf("\n%d", pop(s));
}
