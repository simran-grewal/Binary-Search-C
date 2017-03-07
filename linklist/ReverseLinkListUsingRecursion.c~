/*
    
1>    if current is null , return.
  2>  if current's next is null this means it is the last node so make this as head because the last node will be the head of reversed     list .Return.

3> Recursively traverse the list.
4> set curr->next->next to curr.
set curr->next to null.

*/
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
   struct Node* new = (struct Node *)malloc(sizeof(struct Node));
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
void Print(struct Node* head)
{
    if(head == NULL)
    return;
    
    printf(" %d", head->data);
    Print(head->next);
    
}
void ReverseLinkList(struct Node* curr)
{
    if(curr == NULL) return;
   
    if(curr->next == NULL) 
    {
        head = curr;
        return;
    }
    ReverseLinkList(curr->next);
    curr->next->next = curr;
    curr->next = NULL;
}

int main()
{

    Insert(5);
    Insert(4);
    Insert(3);
    Insert(2);
    Insert(1);
    
    Print(head);
    
    ReverseLinkList(head);

    printf("\n");
    Print(head);

}
