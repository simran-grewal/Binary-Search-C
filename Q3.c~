//Ques-: Given n*n matric having 0 amd 1 only. if 0 is formed at any index,replace all values in the respective row and column with 0

#include<stdio.h>
int main()
{
    int arr[4][4], arr1[4][4];
    int i = 0, j = 0, k, l;
    for(i = 0; i < 4; i++)
    {
        for(j = 0; j < 4; j++)
        {
            scanf("%d", &arr[i][j]);
            arr1[i][j] = arr[i][j];
        }
    }

    for(i = 0; i < 4; i++)
    {
        for(j = 0; j < 4; j++)
        {
            if(arr[i][j] == 0)
            {
                for(l = 0; l < 4; l++ )
                {
                   
                    arr[l][j] = 0;
                    
                }
                
            }
            if(arr1[i][j] == 0)
            {
                for(k = 0;  k < 4;  k++)
                {
                   
                    arr1[i][k] = 0;
                    
                }
                
            }

            
        }
    }


    
   for(i = 0; i < 4; i++)
    {
        for(j = 0; j < 4; j++)
        {
            
            arr[i][j] = arr[i][j] + arr1[i][j];
            
        }
    } 
    
    for(i = 0; i < 4; i++)
    {
        for(j = 0; j < 4; j++)
        {
           if(arr[i][j] == 1||arr[i][j] == 2) 
            arr[i][j] = arr[i][j] - 1;
        }
    }
    for(i = 0; i < 4; i++)
    {
        for(j = 0; j < 4; j++)
        {
                      
             printf("%d", arr[i][j]);
        }

        printf("\n");
    }
    

    
    
    
}
