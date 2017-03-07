#include<stdio.h>
#include<math.h>
int isarmstrong(int n)
{
    int i = 0;
    int f = n;
    int t = n;
    while(f)
    {
        i++;
        f/=10;
    }
    int k=0;
    int l = n;
    while(n)
    {
        f = n%10;
                
        k =k+ pow(f,i);
        n /= 10;
        
    }

   // printf("%d", k);
    if(k == t)
    return k;
    else
    return 0;
}
int main()
{
  //  int n;
   // scanf("%d", &n);
    int i;    
    int a = 1;
    int b = 1000;
    for(i = a; i <= b; i++)
    {    
         printf("%d\n", isarmstrong(i));
    }

}
