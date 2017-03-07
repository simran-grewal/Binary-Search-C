#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

struct node* head = NULL;
struct node* Create_node(int data)
{
    struct node* new = (struct node*)malloc(sizeof(struct node));
    new->data = data;
    new->next = NULL;
    new->prev = NULL;
    return new;
}

void Insert_begin(int data)
{
    struct node* new = Create_node(data);
    if(head == NULL)
    {
        head = new;
    }

    else

    {
        head->prev = new;
        new->prev = NULL;
        new->next = head;        
        head = new;
    }
}

void display()
{
    struct node* ptr = head;
    while(ptr != NULL)
    {
        printf("%d\n", ptr->data);
        ptr = ptr->next;    
    }
}

void reverse()
{
    printf("\n\n\n");
    struct node* ptr = head;
    while(ptr->next != NULL)
    {
        ptr = ptr->next;
    }
    
    while(ptr != NULL)
    {
        printf("%d\n", ptr->data);
        ptr = ptr->prev;
    }
}
int main()
{
    Insert_begin(5);
    Insert_begin(12);
    Insert_begin(6);
    Insert_begin(8);
    Insert_begin(4);
    
    display();
    reverse();
}
