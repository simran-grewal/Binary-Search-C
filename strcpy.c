#include<stdio.h>
#include<stdlib.h>
int main()
{
    
    char *s1 = "grewal";
    char *s2 = (char *)malloc(9 * sizeof(char));
    int i = 0;
    //while((s2[i] = s1[i]) != '\0')
    // i++;
     char *t = s2;   
     while(*s2++=*s1++)
         ;
     
    
    printf("%s", t);
    return 0;
}
