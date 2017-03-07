#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
    char str[6][5] = {"pots", "stop", "done", "tops", "node", "rest"};
   
    int i, j, k;

    char str1[6][5] = {"pots", "stop", "done", "tops", "node", "rest"};
    
    int arr[6] = {0, 1, 2, 3, 4, 5};
    int n = 6;
 
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < 4; j++)
        {
            for(k = 0; k < 4-j-1; k++)
            {
                if(str1[i][k] > str1[i][k+1])
                {
                    char temp;
                    temp = str1[i][k];
                    str1[i][k] = str1[i][k+1];
                    str1[i][k+1] = temp;
                }
            }
                      
         }
     }

    for(i = 0; i < 4; i++)
    {
        for(j = 0; j < n - i - 1; j++)
        {
            if(strcmp(str1[j], str1[j  + 1]) > 0)
            {
                char temp1[5];
                int temp2;
                strcpy(temp1, str1[j]);
                temp2 = arr[j];
                strcpy(str1[j], str1[j + 1]);
                arr[j] = arr[j + 1]; 
                strcpy(str1[j  + 1], temp1);
                arr[j + 1] = temp2;
            }
        }
    }
    
    for(i = 0; i < n; i++)
    {
        printf("%s ", str1[i]);
    }
    printf("\n");
    for(i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }    
}
