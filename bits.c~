
#include<stdio.h>
#include<stdbool.h>
bool ispow(int n)
{
    int i, c = 0;
   /* for(i = 0; i < 32; i++)
    {
        if(n & (1 << (i - 1)))
        {
            c++;
        } 
    }

    if(c > 1)
    {
        return false;
    }
    else
    {
        return true;
    }*/

    return(!(n & (n-1)));    // if we take & between current term and previous term then one set bit get unset.
}
int  main()
{
    int n = 16;
    
    if(!ispow(n))
    {
        printf("Invalid");
        return 0;
    }
    else
    {
    int i;
    int check;
    for(i = 0; i < 32; )
    {
        check = 1 << (i - 1);
    
        if(check & n)
        {
           
            printf("%d", i);
        }
        i++;    
    }
    
    }
}
