#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct emp 
{
    char name[10];
    int age;
    float sal;
}e[100];
void qsortt(struct emp *e, int l, int r);
void swap(struct emp *e, int a, int b);
int main()
{
    int n = 3;
    int i;
   
    for(i = 0; i < n; i++)
    {
        
        scanf("%s %d %f", e[i].name, &e[i].age, &e[i].sal);        
    }
    
    qsortt(e, 0, n - 1);
    
    for(i = 0; i < n; i++)
    {
        printf("%s\n%d\n%f\n", e[i].name,e[i].age, e[i].sal);
    }

}

void qsortt(struct emp *e, int l, int r)
{
     if(l >= r ) return;

    int last = l;
    int i;

    for(i = l + 1; i < r; i++)
    {
        if(e[i].age < e[l].age)
            swap(e, i, ++last);

        if(e[i].age == e[l].age && strcmp((e[i].name),(e[i].name)) > 0)
            swap(e, i, ++last);

        if(e[i].age == )
    }


    swap(e, l, last);

    qsortt(e, l, last - 1);
    
    qsortt(e, last + 1, r);
}
void swap(struct emp *e, int a, int b)
{
 
        struct emp temp;
        temp = e[a];
        e[a] = e[b];
        e[b] = temp;  

}

