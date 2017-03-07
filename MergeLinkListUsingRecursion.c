#include <stdio.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node* next;
};

struct Node* a = NULL;
struct Node* b = NULL;

void Ins_last(int data, struct Node **a)
{
    struct Node* new = (struct Node *)malloc(sizeof(struct Node));
    new->data = data;
    if(*a == NULL)
    {
        *a = new;
    }
    else
    {
        struct Node* ptr = *a;
        while(ptr->next != NULL)
        {
            ptr = ptr->next;
        }

        ptr->next = new;        
    }

}

void print(struct Node* head)
{
    struct Node* ptr = head;
    while(ptr != NULL)
    {
        printf(" %d", ptr->data);
        ptr = ptr->next;
    }
}
struct Node* Merge(struct Node*a, struct Node* b)
{
    struct Node* result = NULL;
    if(a == NULL)
    {
        return b;
    }
    
    if(b == NULL)
    {
        return a;
    }
    if(a->data < b->data)
    {
        result = a;
        result->next = Merge(a->next, b);
    }
    else
    {
        result = b;
        result->next = Merge(a, b->next);
    }


    return result;
}
int main()
{
    Ins_last(2, &a);
    Ins_last(4, &a);
    Ins_last(5, &a);
    Ins_last(6, &a);        
    print(a);
    Ins_last(1, &b);
    Ins_last(3, &b);
    Ins_last(8, &b);
    Ins_last(12, &b);
    Ins_last(14, &b);
    printf("\n\n\n");
    print(b);
    struct Node* head = Merge(a, b);    
    printf("\n\n\n");
    print(head);
    
}
