#include<stdio.h>
#include<stdbool.h>
int main()
{
    int n;
    scanf("%d", &n);
    int zero = 0;
    int one = 0;
    bool alter = true;
    while(n)
    {
        if((n & 1))
        {
            one++;
            if(one > 1)
            {
                alter = false;
                break;
            }
        }
        else
        {
            if(one == 1)
            {
            zero++; 
            if(zero > 1)
            {
                alter = false;
                break;
            }

            }
          
        }

        n>>=1;
    }

    if(alter)
    {
        printf(" Yes ");        
    }
    else
    {
        printf(" No ");
    }
}

