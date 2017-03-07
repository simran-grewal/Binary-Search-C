/*
    Given a string of small latters alphabets, generate the string which is lexically just smaller than it using sa,e set lf charecters
*/

#include<stdio.h>
#include<string.h>
int main()
{
    char str[40];
    gets(str);
    char str1[40],str2[40];
    int i, k, h, j;
    int l=strlen(str);
    for(i = l-1; i >= 0; i--)
    {
        if(str[i-1]>str[i])
        {
            h = i-1;
            break;
        }
    }

    for(i = 0; i <= h; i++)
    {
        str1[k] = str[i];
        k++;
    }
    str1[k] = '\0';

    k = 0;
    for(i = h + 1; i <= l; i++)
    {
        str2[k] = str[i];
        k++;
    }
 
    str2[k] = '\0';
 
    for(i = 0; i < strlen(str2); i++)
    {
        for(j = i + 2; j < strlen(str2); j++)
        {
            
        }
    }
    printf("%s\n",str1); printf("%s\n",str2);
    
}
