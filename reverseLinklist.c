#include <stdio.h>
#include <stdlib.h>
struct Node 
{
    int data;
    struct Node* next;
};

struct Node* head = NULL;
void reverse()
{
    struct Node *prev, *current, *next;
    current = head;
    prev = NULL;
    while(current != NULL)
    {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }

    head = prev;
}

void ins(int data)
{
    struct Node* new = (struct Node*)malloc(sizeof(struct Node));
    new->data = data;
    if(head == NULL)
    {
        head = new;
    }
    else
    {
        new->next = head;
        head = new;
    }

    
}
void print()
{
    struct Node* ptr = head;
    while(ptr != NULL)
    {
        printf("%d\n", ptr->data);
        ptr = ptr->next;
    }
}
int main()
{
    ins(1);
    ins(2);
    ins(3);
    ins(4);
    ins(5);
    print();
    reverse();
    printf("\n\n\n\n");
    print();
}
