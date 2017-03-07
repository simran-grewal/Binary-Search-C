#include <stdio.h>
#include <stdlib.h>

struct stack
{
    int data;
    struct stack *next;
};

static struct stack *first = NULL;
static int n = 0;

void push(int data)
{
 
    
    
    struct stack* old = first;
    first = (struct stack *)malloc(sizeof(struct stack));
    first->data = data;
    first->next = old;
    n++;

    printf("\n Pushed");
    
    
}

void pop()
{
    if(n == 0)
    {
       printf("\n!Empty");
                
    }
    else
    {
    struct stack* old = first;
    int data = first->data;
    first = first->next;
    old->next = NULL;
    free(old);
    n--;
    printf("\n%d is poped", data);    
    }
}
int main()
{
    push(4);
    push(12);
    push(45);
    push(9);
        
    printf("\n%d", n);

    pop();
    pop();
    pop();
    pop();
    pop();
    pop();
    pop();
}
