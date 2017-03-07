#include <stdio.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node* next;
};
struct Node* head = NULL;
void Insert(int data)
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
    struct Node* temp = head;
    while(temp != NULL)
    {
        printf(" %d", temp->data);
        temp = temp->next;
    }
}
void Redundency()
{
    struct Node* preptr = head;
    struct Node* ptr = head;
    while(preptr != NULL && preptr->next != NULL)
    {
        ptr = preptr;
        while(ptr->next != NULL)
        {
            if(preptr->data == ptr->next->data)
            {
                ptr->next = ptr->next->next;
            }

            else
            {
                ptr = ptr->next;
            }
        }

        preptr = preptr->next;
    }
}
int main()
{
    Insert(6);
    Insert(9);
    Insert(9);
    Insert(3);
    Insert(2);
    Insert(9);
    Insert(6);
    Insert(1);

    print();
    
    Redundency();
    
    printf("\n\n");
    print();
}

