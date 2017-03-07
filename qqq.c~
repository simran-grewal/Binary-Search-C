#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<assert.h>
#include<stdbool.h>
int main()
{
    char str1[] = "hello";
    char str2[] = "";
    int i, j;
   // assert(str2[i] != '\0')
    int l1 = strlen(str1);
    int l2 = strlen(str2);
    assert(l2 < l1);
    
    
    l1 -= l2;
    
    bool yes = true;

    for(i = l1, j = 0; str1[i] != '\0'; i++, j++)
    {
        if(str1[i] == str2[j])
        {
            ;
        }
        else
        {
            yes = false;
        }
    }
       
    if(yes)
    {
        printf("is present at end");
    }
  
    else
    {
        printf("Not present at end");
    }
    
    
}
