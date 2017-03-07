#include<stdio.h>
int main()
{
    int Matrix[][4]={{1,0,1,1},{1,1,1,1},{0,1,1,1},{1,1,1,1}};
    
    int i, j, zrows = 0, zcols = 0;
   
    for(i = 0; i < 4; i++)
    {
        for(j = 0; j < 4; j++)
        {
            if(Matrix[i][j] == 0)
            {
                zrows = zrows|(1 << i);
                zcols=zcols|(1 << j);
            }            
        }

        
    }

    for(i = 0; i < 32; i++ )
    {
        if((zrows & (1 << i)) != 0)
        {
            for( j = 0; j < 4; j++)
            {
                Matrix[i][j] = 0;
            }
        }
    }

    for(j = 0; j < 32; j++ )
    {
        if((zcols & (1 << j)) != 0)
        {
            for( i = 0; i < 4; i++)
            {
                Matrix[i][j] = 0;
            }
        }
    }


    for(i = 0; i < 4; i++)
    {
        for(j = 0; j < 4; j++)
        {
            printf("%d", Matrix[i][j]);
        }

        printf("\n");
    }
}
