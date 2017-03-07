/* To reverse the sentence firstly reverse all the word than reverse whole the string

   eg--- My name is simran
   OutPut should be-- simran is name My

*/
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
char* ReverseCharacters(char* pStart, char* pEnd)
{
    
    char *str = pStart;
    while(pEnd > pStart)
    {
        char temp;
        temp = *pStart;
        *pStart = *pEnd;
        *pEnd = temp;
        
       pStart++;
       pEnd--;    
    }

    //return str;
}
char* ReverseSentence(char* str)
{
    char *pStart = str;
    char *pEnd = str;
    while(*pEnd)
    {
        if(*pEnd == ' ')
        {
            ReverseCharacters(pStart, pEnd - 1);
            pStart = pEnd + 1;
        }

        pEnd++;
    }   

    ReverseCharacters(pStart, pEnd - 1);
    
    pStart = str;
    ReverseCharacters(pStart, pEnd - 1);
   
}
int main()
{
    char str[] = "my name is simran";
    
    
    ReverseSentence(str);
    printf("%s\n", str);   
       
}
