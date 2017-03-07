/* 
    Given an dictionary of english words, find set of anagrams .Eg->
    i/p pots,stop,done,tops,node,rest;
    o/p pots,stop,tops,node,done,rest;
*/
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int isana(char *str1, char *str2);
int main()
{
    int n = 6, i, j;
    
    char str[10][20];
    for(i = 0; i < n; i++)
    {
        scanf("%s",str[i]);
    }

    for(i = 0; i < n - 1; i++)
    {
        for(j = i+1; j< n; j++)
        {
            if(isana(str[i],str[j]))
            {
                    
            }
        }
    }    

    for(i = 0; i < n; i++)
    {
        printf("%s",str[i]);
        printf("\n");
    }

}

int isana(char *str1, char *str2)
{
    int * arr, i;
    arr=(int *)calloc(sizeof(int),300);
    if(strlen(str1) == strlen(str2))
    {
        for(i = 0; i < strlen(str1); i++)
        {
            arr[str1[i]]++;
        }
        
        for(i = 0; i < strlen(str1); i++)
        {
            arr[str1[i]]--;
        }

        for(i = 0; i < 300; i++)
        {
            if(arr[i]!=0)
            {
                return 0;    
            }
        }
        
        return 1;
    
    }
    else
    {
        return 0;
    }
}
