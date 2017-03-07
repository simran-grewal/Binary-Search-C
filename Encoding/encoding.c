#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int arr1[100000], size, j = 0;

void base_64(char *str, char * b64)
{
      int size = j;
    int k = 0;
    int p = 0;
    int sum = 0;
    int l = 0;
    int *array;
    int w = 0;
    int size_arr = (strlen(str) * 8)/6;
 
    array = (int *)malloc(size_arr * sizeof(int));
    int i;
    for(i = 0; i < size; i += 6)
    {
         p = 5;
        for(k = i; k < i + 6; k++)
        {
            sum += (pow(2, p) * arr1[l]);
            p--;
            l++;
        }

        array[w] = sum;
        w++;
        sum = 0;
    }

    for(i = 0; i <= size_arr; i++)
    {
        printf("%c", b64[array[i]]);
    }

    int equal = size_arr % 3;

    while(equal)
    {
        printf("=");
        equal--;
    }

}

void convert(int n)
{
    int i;
    
    
    
    for(i = 1 << 7; i > 0; i /= 2)
    {
        if(i & n)
        {
            arr1[j] = 1;
        }

        else
        
        {
            arr1[j] = 0;
        }

        j++;
      
    }
        
     size = j;
   
}

int main()
{
    char b64[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    
    char *str = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
    int s = strlen(str);
    int arr[100000];
    int i ;
    for(i = 0; str[i] != '\0'; i++)
    {
        arr[i] = str[i];
    }

    for(i = 0; i < s; i++)
    {
        convert(arr[i]);
    }  
    
 

    base_64(str, b64);
}
