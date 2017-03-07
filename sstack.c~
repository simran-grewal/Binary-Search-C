#include <stdio.h>
#include <stdlib.h>
#include "stack_header.h"
struct node
{
    void* item;
    struct node *next;
};

static struct node *first = NULL;
static int n = NULL;
void push(void * item)
{
    struct node * oldfirst = first;
    first = (struct node *)malloc(sizeof(struct node));
    first->item = item;
    first->next = oldfirst;
    n++;
}

void* pop()
{
    struct node * oldfirst = first;
    void* item = first->item;
    first = first->next;
    oldfirst->next = NULL;
    n--;
    free(oldfirst);
    return item;
}

int size()
{
    return n;
}
