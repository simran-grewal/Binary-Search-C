#include <stdio.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node* next;
};
int stack[100];
int top = -1;

struct Node* start = NULL;
void Insert(int data)
{
    struct Node* new = (struct Node *)malloc(sizeof(struct Node));
    new->next = NULL;
    new->data = data;

    if(start == NULL)
    start = new;

    else
    {
        new->next = start;
        start = new;
    }

    
}

void Display()
{
    struct Node* ptr = start;
    while(ptr != NULL)
    {
        stack[++top] = ptr->data;
        printf(" %d", ptr->data);
        ptr = ptr->next;
    }
}
void check()
{
    int flag = 1;
    struct Node* ptr = start;
    while(ptr != NULL)
    {
        if(ptr->data == stack[top--])
        {
            ptr = ptr->next;
        }
        
        else

        {
            printf("Not");
            flag = 0;
            break;
        }    
    }

    if(flag)
    printf("Yes");
}
void Reverse()
{
    struct Node *next, *current, *prev;
    current = start;
    prev = NULL;
    
    while(current != NULL)
    {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }

    start = prev;
}

int main()
{
    Insert(9);
    Insert(2);
    Insert(0);
    Insert(2);
    Insert(9);
    Display();
    
   // Reverse();
    printf("\n");

    check();
     
   
}
